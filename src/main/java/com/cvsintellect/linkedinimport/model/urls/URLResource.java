package com.cvsintellect.linkedinimport.model.urls;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class URLResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String url;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private Headers headers;

	public URLResource() {
		super();
	}

	public URLResource(String url, String name, Headers headers) {
		super();
		this.url = url;
		this.name = name;
		this.headers = headers;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Headers getHeaders() {
		return headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
}
