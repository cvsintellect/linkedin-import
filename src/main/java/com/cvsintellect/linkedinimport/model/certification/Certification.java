package com.cvsintellect.linkedinimport.model.certification;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.LinkedInDate;

public class Certification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private CertifyingAuthority authority;

	@Element(required = false)
	private String number;

	@Element(name = "start-date", required = false)
	private LinkedInDate startDate;

	@Element(name = "end-date", required = false)
	private LinkedInDate endDate;

	public Certification() {
		super();
	}

	public Certification(String linkedinId, String name, CertifyingAuthority authority, String number, LinkedInDate startDate, LinkedInDate endDate) {
		super();
		this.linkedinId = linkedinId;
		this.name = name;
		this.authority = authority;
		this.number = number;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public CertifyingAuthority getAuthority() {
		return authority;
	}

	public void setAuthority(CertifyingAuthority authority) {
		this.authority = authority;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
}
