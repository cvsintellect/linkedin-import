package com.cvsintellect.linkedinimport.model.courses;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class CourseSetInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "course", inline = true, required = false)
	private List<CourseSet> courseSet;

	public CourseSetInfo() {
		super();
	}

	public CourseSetInfo(int total, List<CourseSet> courseSet) {
		super();
		this.total = total;
		this.courseSet = courseSet;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<CourseSet> getCourseSet() {
		return courseSet;
	}

	public void setCourseSet(List<CourseSet> courseSet) {
		this.courseSet = courseSet;
	}
}
