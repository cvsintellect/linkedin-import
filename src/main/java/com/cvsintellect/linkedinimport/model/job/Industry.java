package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Element;

public class Industry {
	@Element(required = false)
	private String id;

	@Element(required = false)
	private String code;

	@Element(required = false)
	private String name;

	public Industry() {
		super();
	}

	public Industry(String id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
