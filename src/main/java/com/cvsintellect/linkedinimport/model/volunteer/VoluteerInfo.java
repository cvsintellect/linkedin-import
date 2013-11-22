package com.cvsintellect.linkedinimport.model.volunteer;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class VoluteerInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "volunteer-experiences", required = false)
	private VolunteerExperienceInfo volunteerExperiences;

	public VoluteerInfo() {
		super();
	}

	public VoluteerInfo(VolunteerExperienceInfo volunteerExperiences) {
		super();
		this.volunteerExperiences = volunteerExperiences;
	}

	public VolunteerExperienceInfo getVolunteerExperiences() {
		return volunteerExperiences;
	}

	public void setVolunteerExperiences(VolunteerExperienceInfo volunteerExperiences) {
		this.volunteerExperiences = volunteerExperiences;
	}
}
