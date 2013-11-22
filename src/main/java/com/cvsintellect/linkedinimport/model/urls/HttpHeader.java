package com.cvsintellect.linkedinimport.model.urls;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class HttpHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private String value;

	public HttpHeader() {
		super();
	}

	public HttpHeader(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
