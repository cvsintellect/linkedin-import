package com.cvsintellect.linkedinimport.model.education;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.LinkedInDate;

public class Education implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	private String university;

	@Element(name = "school-name", required = false)
	private String schoolName;

	@Element(name = "field-of-study", required = false)
	private String fieldOfStudy;

	@Element(name = "start-date", required = false)
	private LinkedInDate startDate;

	@Element(name = "end-date", required = false)
	private LinkedInDate endDate;

	private boolean isCurrent;

	@Element(required = false)
	private String degree;

	@Element(required = false)
	private String activities;

	@Element(required = false)
	private String notes;

	public Education() {
		super();
	}

	public Education(String linkedinId, String university, String schoolName, String fieldOfStudy, LinkedInDate startDate, LinkedInDate endDate,
			boolean isCurrent, String degree, String activities, String notes) {
		super();
		this.linkedinId = linkedinId;
		this.university = university;
		this.schoolName = schoolName;
		this.fieldOfStudy = fieldOfStudy;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isCurrent = isCurrent;
		this.degree = degree;
		this.activities = activities;
		this.notes = notes;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public LinkedInDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LinkedInDate startDate) {
		this.startDate = startDate;
	}

	public LinkedInDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LinkedInDate endDate) {
		this.endDate = endDate;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
