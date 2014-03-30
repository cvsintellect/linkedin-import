package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class JobsInfo {
	@Attribute(required = false)
	private int total;

	@Attribute(required = false)
	private int start;

	@ElementList(entry = "job", inline = true, required = false)
	private List<Job> jobs;

	public JobsInfo() {
		super();
	}

	public JobsInfo(int total, int start, List<Job> jobs) {
		super();
		this.total = total;
		this.start = start;
		this.jobs = jobs;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
}
