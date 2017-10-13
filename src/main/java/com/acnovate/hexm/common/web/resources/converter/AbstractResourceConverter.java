package com.acnovate.hexm.common.web.resources.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
/**
 * Converts from one object representation to another.
 *
 * @param <S>
 *            defines the source type of the converter
 * @param <T>
 *            defines the target type of the converter
 */
public interface AbstractResourceConverter<S, T> {

	/**
	 * Converts a {@link List} of source types to a {@link List} of target
	 * types. The conversion is done by calling calling {@code convert} for each
	 * member.
	 *
	 * @param source
	 *            {@link List} of source types, that shall be converted to a
	 *            {@link List} of target types.
	 * @return a {@link List} of converted source types
	 */
	public default List<T> convert(@Nonnull final List<S> source) {
		final List<T> target = new ArrayList<>(source.size());
		for (final S s : source) {
			target.add(convert(s));
		}
		return target;
	}

	/**
	 * Converts a {@link Map} of source types to a {@link Map} of target types.
	 * The conversion is done by calling calling {@code convert} for each
	 * member.
	 *
	 * @param source
	 *            {@link Map} of source types, that shall be converted to a
	 *            {@link Map} of target types.
	 * @return a {@link Map} of converted source types
	 */
	@Nonnull
	public default <K> Map<K, T> convert(@Nonnull final Map<K, S> source) {
		final Map<K, T> target = new HashMap<>(source.size());
		for (final Map.Entry<K, S> entry : source.entrySet()) {
			target.put(entry.getKey(), convert(entry.getValue()));
		}

		return target;
	}

	/**
	 * Converts a element of source type to a element of target type.
	 *
	 * @param source
	 *            {@code S} of source type, that shall be converted to a target
	 *            type
	 * @return converted source type.
	 */
	public abstract T convert(final S source);

	/**
	 * Converts a {@link Set} of source types to a {@link Set} of target types.
	 * The conversion is done by calling calling {@code convert} for each
	 * member.
	 *
	 * @param source
	 *            {@link Set} of source types, that shall be converted to a
	 *            {@link Set} of target types.
	 * @return a {@link Set} of converted source types
	 */
	@Nonnull
	public default Set<T> convert(@Nonnull final Set<S> source) {
		final Set<T> target = new HashSet<>(source.size());
		for (final S s : source) {
			target.add(convert(s));
		}
		return target;
	}
}
