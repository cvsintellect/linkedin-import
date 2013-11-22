package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.main.PersonProfile;

public class Inventor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String name;

	@Element(name = "person", required = false)
	private PersonProfile personProfile;

	public Inventor() {
		super();
	}

	public Inventor(String linkedinId, String name, PersonProfile personProfile) {
		super();
		this.linkedinId = linkedinId;
		this.name = name;
		this.personProfile = personProfile;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonProfile getPersonProfile() {
		return personProfile;
	}

	public void setPersonProfile(PersonProfile personProfile) {
		this.personProfile = personProfile;
	}
}
