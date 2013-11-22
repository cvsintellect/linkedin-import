package com.cvsintellect.linkedinimport.model.position;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.LinkedInDate;

public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String title;

	@Element(required = false)
	private String summary;

	@Element(name = "start-date", required = false)
	private LinkedInDate startDate;

	@Element(name = "end-date", required = false)
	private LinkedInDate endDate;

	@Element(name = "is-current", required = false)
	private boolean isCurrent;

	@Element(required = false)
	private Company company;

	public Position() {
		super();
	}

	public Position(String linkedinId, String title, String summary, LinkedInDate startDate, LinkedInDate endDate, boolean isCurrent, Company company) {
		super();
		this.linkedinId = linkedinId;
		this.title = title;
		this.summary = summary;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isCurrent = isCurrent;
		this.company = company;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
