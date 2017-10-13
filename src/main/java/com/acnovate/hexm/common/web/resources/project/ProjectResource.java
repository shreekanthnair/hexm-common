package com.acnovate.hexm.common.web.resources.project;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

@Relation(value = "project", collectionRelation = "projects")
public class ProjectResource extends ResourceSupport {

	private String projectName;
	private String projectCode;
	private String projectManager;
	private LocationResource location;
	private boolean external;
	private String clientName;
	private long poNumber;
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectCode
	 */
	public String getProjectCode() {
		return projectCode;
	}
	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	/**
	 * @return the projectManager
	 */
	public String getProjectManager() {
		return projectManager;
	}
	/**
	 * @param projectManager the projectManager to set
	 */
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	/**
	 * @return the location
	 */
	public LocationResource getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(LocationResource location) {
		this.location = location;
	}
	/**
	 * @return the external
	 */
	public boolean isExternal() {
		return external;
	}
	/**
	 * @param external the external to set
	 */
	public void setExternal(boolean external) {
		this.external = external;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the poNumber
	 */
	public long getPoNumber() {
		return poNumber;
	}
	/**
	 * @param poNumber the poNumber to set
	 */
	public void setPoNumber(long poNumber) {
		this.poNumber = poNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((projectCode == null) ? 0 : projectCode.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ProjectResource))
			return false;
		ProjectResource other = (ProjectResource) obj;
		if (projectCode == null) {
			if (other.projectCode != null)
				return false;
		} else if (!projectCode.equals(other.projectCode))
			return false;
		return true;
	}
	
}
