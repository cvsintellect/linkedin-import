package com.cvsintellect.linkedinimport.model.publication;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class AuthorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "author", inline = true, required = false)
	private List<Author> authors;

	public AuthorInfo() {
		super();
	}

	public AuthorInfo(int total, List<Author> authors) {
		super();
		this.total = total;
		this.authors = authors;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}
