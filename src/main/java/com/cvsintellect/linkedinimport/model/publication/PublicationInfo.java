package com.cvsintellect.linkedinimport.model.publication;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class PublicationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "publication", inline = true, required = false)
	private List<Publication> publications;

	public PublicationInfo() {
		super();
	}

	public PublicationInfo(int total, List<Publication> publications) {
		super();
		this.total = total;
		this.publications = publications;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}
}
