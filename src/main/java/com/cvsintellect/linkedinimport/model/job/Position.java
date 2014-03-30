package com.cvsintellect.linkedinimport.model.job;

import com.cvsintellect.linkedinimport.model.contact.Location;
import org.simpleframework.xml.Element;

import java.io.Serializable;

public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String title;

	@Element(name = "job-functions", required = false)
	private JobFunctionsInfo jobFunctions;

	@Element(name = "industries", required = false)
	private IndustriesInfo industries;

	@Element(name = "job-type", required = false)
	private JobType jobType;

	@Element(name = "experience-level", required = false)
	private ExperienceLevel experienceLevel;

	@Element(required = false)
	private Location location;

	public Position() {
		super();
	}

	public Position(String title, JobFunctionsInfo jobFunctions, IndustriesInfo industries, JobType jobType, ExperienceLevel experienceLevel, Location location) {
		super();
		this.title = title;
		this.jobFunctions = jobFunctions;
		this.industries = industries;
		this.jobType = jobType;
		this.experienceLevel = experienceLevel;
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public JobFunctionsInfo getJobFunctions() {
		return jobFunctions;
	}

	public void setJobFunctions(JobFunctionsInfo jobFunctions) {
		this.jobFunctions = jobFunctions;
	}

	public IndustriesInfo getIndustries() {
		return industries;
	}

	public void setIndustries(IndustriesInfo industries) {
		this.industries = industries;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public ExperienceLevel getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(ExperienceLevel experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
