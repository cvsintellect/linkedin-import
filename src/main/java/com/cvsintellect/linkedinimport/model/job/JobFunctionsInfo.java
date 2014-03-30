package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class JobFunctionsInfo {
	@Attribute(required = false)
	private int total;

	@ElementList(entry = "job-function", inline = true, required = false)
	private List<JobFunction> jobFunctions;

	public JobFunctionsInfo() {
		super();
	}

	public JobFunctionsInfo(int total, List<JobFunction> jobFunctions) {
		super();
		this.total = total;
		this.jobFunctions = jobFunctions;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<JobFunction> getJobFunctions() {
		return jobFunctions;
	}

	public void setJobFunctions(List<JobFunction> jobFunctions) {
		this.jobFunctions = jobFunctions;
	}
}
