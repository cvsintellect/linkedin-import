package com.cvsintellect.linkedinimport.model.education;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class EducationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "education", inline = true, required = false)
	private List<Education> educations;

	public EducationInfo() {
		super();
	}

	public EducationInfo(int total, List<Education> educations) {
		super();
		this.total = total;
		this.educations = educations;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}
}
