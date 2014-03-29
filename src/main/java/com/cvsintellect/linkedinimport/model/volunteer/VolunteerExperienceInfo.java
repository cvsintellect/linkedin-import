package com.cvsintellect.linkedinimport.model.volunteer;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class VolunteerExperienceInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "volunteer-experience", inline = true, required = false)
	private List<Volunteer> volunteers;

	public VolunteerExperienceInfo() {
		super();
	}

	public VolunteerExperienceInfo(int total, List<Volunteer> volunteers) {
		super();
		this.total = total;
		this.volunteers = volunteers;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Volunteer> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<Volunteer> volunteers) {
		this.volunteers = volunteers;
	}
}
