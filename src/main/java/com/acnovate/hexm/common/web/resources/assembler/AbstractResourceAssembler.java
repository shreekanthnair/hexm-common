package com.acnovate.hexm.common.web.resources.assembler;

import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.RelProvider;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public abstract class AbstractResourceAssembler<T, D extends ResourceSupport> extends ResourceAssemblerSupport<T, D> {

	private RelProvider relProvider;
	private EntityLinks entityLinks;

	public AbstractResourceAssembler(Class<?> controllerClass, Class<D> resourceType) {
		super(controllerClass, resourceType);
	}

	/**
	 * @return the relProvider
	 */
	public RelProvider getRelProvider() {
		return relProvider;
	}

	/**
	 * @param relProvider
	 *            the relProvider to set
	 */
	public void setRelProvider(RelProvider relProvider) {
		this.relProvider = relProvider;
	}

	/**
	 * @return the entityLinks
	 */
	public EntityLinks getEntityLinks() {
		return entityLinks;
	}

	/**
	 * @param entityLinks
	 *            the entityLinks to set
	 */
	public void setEntityLinks(EntityLinks entityLinks) {
		this.entityLinks = entityLinks;
	}

}
