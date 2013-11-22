package com.cvsintellect.linkedinimport.model.publication;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.LinkedInDate;

public class Publication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String title;

	@Element(required = false)
	private Publisher publisher;

	@Element(required = false)
	private AuthorInfo authors;

	@Element(required = false)
	private LinkedInDate date;

	@Element(required = false)
	private String url;

	@Element(required = false)
	private String summary;

	public Publication() {
		super();
	}

	public Publication(String linkedinId, String title, Publisher publisher, AuthorInfo authors, LinkedInDate date, String url, String summary) {
		super();
		this.linkedinId = linkedinId;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.date = date;
		this.url = url;
		this.summary = summary;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public AuthorInfo getAuthors() {
		return authors;
	}

	public void setAuthors(AuthorInfo authors) {
		this.authors = authors;
	}

	public LinkedInDate getDate() {
		return date;
	}

	public void setDate(LinkedInDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
