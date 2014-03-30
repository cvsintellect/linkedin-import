package com.cvsintellect.linkedinimport.model.main;

import com.cvsintellect.linkedinimport.model.job.JobsInfo;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class JobSearchInfo {
	@Element(name = "jobs", required = false)
	private JobsInfo jobs;

	public JobSearchInfo() {
		super();
	}

	public JobSearchInfo(int total, JobsInfo jobs) {
		super();
		this.jobs = jobs;
	}

	public JobsInfo getJobs() {
		return jobs;
	}

	public void setJobs(JobsInfo jobs) {
		this.jobs = jobs;
	}
}
