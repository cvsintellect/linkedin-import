package com.cvsintellect.linkedinimport.model.recommendation;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class RecommendationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String code;

	public RecommendationType() {
		super();
	}

	public RecommendationType(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
