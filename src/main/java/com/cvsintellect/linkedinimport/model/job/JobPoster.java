package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Element;

public class JobPoster {
	@Element(name = "id")
	private String linkedinId;

	@Element(name = "first-name", required = false)
	private String firstName;

	@Element(name = "last-name", required = false)
	private String lastName;

	@Element(required = false)
	private String headline;

	public JobPoster() {
		super();
	}

	public JobPoster(String linkedinId, String firstName, String lastName, String headline) {
		super();
		this.linkedinId = linkedinId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.headline = headline;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
}
