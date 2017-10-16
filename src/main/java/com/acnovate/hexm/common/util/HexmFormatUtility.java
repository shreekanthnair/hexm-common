package com.acnovate.hexm.common.util;

import java.util.Collection;

public class HexmFormatUtility {

	private HexmFormatUtility() {
		// Private Constructor to prevent initialization
		super();
	}

	/**
	 * Checks if a String is null or empty and returns true in case it is.
	 * 
	 * @param source
	 * @return
	 */
	public static boolean hasContent(String source) {
		return source != null && (!(source.isEmpty()));
	}

	/**
	 * Checks if a collection is null or empty and returns true in case it is.
	 * 
	 * @param sourceCollection
	 * @return
	 */
	public static boolean hasContent(Collection<?> sourceCollection) {
		return sourceCollection != null && (!sourceCollection.isEmpty());
	}
}
