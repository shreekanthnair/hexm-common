package com.acnovate.hexm.common.web.resources.project;

import java.math.BigDecimal;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

@Relation(value = "location", collectionRelation = "locations")
public class LocationResource extends ResourceSupport {

	private Long locationId;
	private String locationName;
	private String region;
	private String country;
	private BigDecimal perDM;
	private String currency;

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the perDM
	 */
	public BigDecimal getPerDM() {
		return perDM;
	}

	/**
	 * @param perDM
	 *            the perDM to set
	 */
	public void setPerDM(BigDecimal perDM) {
		this.perDM = perDM;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof LocationResource))
			return false;
		LocationResource other = (LocationResource) obj;
		if (locationId == null) {
			if (other.locationId != null)
				return false;
		} else if (!locationId.equals(other.locationId))
			return false;
		return true;
	}
}
