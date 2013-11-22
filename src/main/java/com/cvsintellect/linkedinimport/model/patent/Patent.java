package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.LinkedInDate;

public class Patent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String title;

	@Element(required = false)
	private String summary;

	@Element(required = false)
	private String number;

	@Element(required = false)
	private PatentStatus status;

	@Element(required = false)
	private PatentOffice office;

	@Element(name = "inventors", required = false)
	private InventorInfo inventors;

	@Element(required = false)
	private LinkedInDate date;

	@Element(required = false)
	private String url;

	public Patent() {
		super();
	}

	public Patent(String linkedinId, String title, String summary, String number, PatentStatus status, PatentOffice office, InventorInfo inventors,
			LinkedInDate date, String url) {
		super();
		this.linkedinId = linkedinId;
		this.title = title;
		this.summary = summary;
		this.number = number;
		this.status = status;
		this.office = office;
		this.inventors = inventors;
		this.date = date;
		this.url = url;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PatentStatus getStatus() {
		return status;
	}

	public void setStatus(PatentStatus status) {
		this.status = status;
	}

	public PatentOffice getOffice() {
		return office;
	}

	public void setOffice(PatentOffice office) {
		this.office = office;
	}

	public void setInventors(InventorInfo inventors) {
		this.inventors = inventors;
	}

	public InventorInfo getInventors() {
		return inventors;
	}

	public LinkedInDate getDate() {
		return date;
	}

	public void setDate(LinkedInDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
