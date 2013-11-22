package com.cvsintellect.linkedinimport.model.position;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id", required = false)
	private String linkedinId;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private String type;

	@Element(required = false)
	private String size;

	@Element(required = false)
	private String industry;

	@Element(required = false)
	private String ticker;

	public Company() {
		super();
	}

	public Company(String linkedinId, String name, String type, String size, String industry, String ticker) {
		super();
		this.linkedinId = linkedinId;
		this.name = name;
		this.type = type;
		this.size = size;
		this.industry = industry;
		this.ticker = ticker;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
}
