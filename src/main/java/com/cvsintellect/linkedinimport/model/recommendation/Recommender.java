package com.cvsintellect.linkedinimport.model.recommendation;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Recommender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name="id")
	private String linkedinId;

	@Element(name = "first-name", required = false)
	private String firstName;

	@Element(name = "last-name", required = false)
	private String lastName;

	public Recommender() {
		super();
	}

	public Recommender(String linkedinId, String firstName, String lastName) {
		super();
		this.linkedinId = linkedinId;
		this.firstName = firstName;
		this.lastName = lastName;
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
}
