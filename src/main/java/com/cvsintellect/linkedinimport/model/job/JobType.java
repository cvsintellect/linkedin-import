package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Element;

public class JobType {
	@Element(required = false)
	private String code;

	@Element(required = false)
	private String name;

	public JobType() {
		super();
	}

	public JobType(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
