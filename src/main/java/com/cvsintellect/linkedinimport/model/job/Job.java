package com.cvsintellect.linkedinimport.model.job;

import com.cvsintellect.linkedinimport.model.position.Company;
import com.cvsintellect.linkedinimport.model.util.LinkedInDate;
import org.simpleframework.xml.Element;

public class Job {
	@Element(name = "id", required = false)
	private String linkedinId;

	@Element(name = "customer-job-code", required = false)
	private String customerJobCode;

	@Element(required = false)
	private String active;

	@Element(name = "posting-date", required = false)
	private LinkedInDate postingDate;

	@Element(name = "expiration-date", required = false)
	private LinkedInDate expirationDate;

	@Element(required = false)
	private Company company;

	@Element(required = false)
	private Position position;

	@Element(name = "skills-and-experience", required = false)
	private String skillsAndExperience;

	@Element(required = false)
	private String description;

	@Element(required = false)
	private String salary;

	@Element(name = "job-poster", required = false)
	private JobPoster jobPoster;

	@Element(name = "referral-bonus", required = false)
	private String referralBonus;

	@Element(name = "site-job-url", required = false)
	private String siteJobURL;

	@Element(name = "location-description", required = false)
	private String locationDescription;

	public Job() {
		super();
	}

	public Job(String linkedinId, String customerJobCode, String active, LinkedInDate postingDate, LinkedInDate expirationDate, Company company, Position position, String skillsAndExperience, String description, String salary, JobPoster jobPoster, String referralBonus, String siteJobURL, String locationDescription) {
		super();
		this.linkedinId = linkedinId;
		this.customerJobCode = customerJobCode;
		this.active = active;
		this.postingDate = postingDate;
		this.expirationDate = expirationDate;
		this.company = company;
		this.position = position;
		this.skillsAndExperience = skillsAndExperience;
		this.description = description;
		this.salary = salary;
		this.jobPoster = jobPoster;
		this.referralBonus = referralBonus;
		this.siteJobURL = siteJobURL;
		this.locationDescription = locationDescription;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getCustomerJobCode() {
		return customerJobCode;
	}

	public void setCustomerJobCode(String customerJobCode) {
		this.customerJobCode = customerJobCode;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public LinkedInDate getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(LinkedInDate postingDate) {
		this.postingDate = postingDate;
	}

	public LinkedInDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LinkedInDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getSkillsAndExperience() {
		return skillsAndExperience;
	}

	public void setSkillsAndExperience(String skillsAndExperience) {
		this.skillsAndExperience = skillsAndExperience;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public JobPoster getJobPoster() {
		return jobPoster;
	}

	public void setJobPoster(JobPoster jobPoster) {
		this.jobPoster = jobPoster;
	}

	public String getReferralBonus() {
		return referralBonus;
	}

	public void setReferralBonus(String referralBonus) {
		this.referralBonus = referralBonus;
	}

	public String getSiteJobURL() {
		return siteJobURL;
	}

	public void setSiteJobURL(String siteJobURL) {
		this.siteJobURL = siteJobURL;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
}
