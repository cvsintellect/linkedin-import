package com.cvsintellect.linkedinimport.model.urls;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class Headers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "http-header", inline = true, required = false)
	private List<HttpHeader> httpHeaders;

	public Headers() {
		super();
	}

	public Headers(int total, List<HttpHeader> httpHeaders) {
		super();
		this.total = total;
		this.httpHeaders = httpHeaders;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<HttpHeader> getHttpHeaders() {
		return httpHeaders;
	}

	public void setHttpHeaders(List<HttpHeader> httpHeaders) {
		this.httpHeaders = httpHeaders;
	}
}
