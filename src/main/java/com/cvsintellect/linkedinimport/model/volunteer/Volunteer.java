package com.cvsintellect.linkedinimport.model.volunteer;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Volunteer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private int linkedinId;

	@Element(required = false)
	private String role;

	@Element(required = false)
	private Organization organization;

	@Element(required = false)
	private Cause cause;

	public Volunteer() {
		super();
	}

	public Volunteer(int linkedinId, String role, Organization organization, Cause cause) {
		super();
		this.linkedinId = linkedinId;
		this.role = role;
		this.organization = organization;
		this.cause = cause;
	}

	public int getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(int linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Cause getCause() {
		return cause;
	}

	public void setCause(Cause cause) {
		this.cause = cause;
	}
}
