package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Element;

public class JobFunction {
	@Element(required = false)
	private String code;

	@Element(required = false)
	private String name;

	public JobFunction() {
		super();
	}

	public JobFunction(String code, String name) {
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
