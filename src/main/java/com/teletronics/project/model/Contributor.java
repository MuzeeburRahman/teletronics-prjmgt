package com.teletronics.project.model;

import java.util.List;

public class Contributor {
	
	private Long contributorId;
	private String contributorname;
	private List<Long> projectIds;
	
	public Contributor(Long contributorId, String contributorname, List<Long> projectIds) {
		super();
		this.contributorId = contributorId;
		this.contributorname = contributorname;
		this.projectIds = projectIds;
	}
	public Long getContributorId() {
		return contributorId;
	}
	public void setContributorId(Long contributorId) {
		this.contributorId = contributorId;
	}
	public String getContributorname() {
		return contributorname;
	}
	public void setContributorname(String contributorname) {
		this.contributorname = contributorname;
	}
	public List<Long> getProjectIds() {
		return projectIds;
	}
	public void setProjectIds(List<Long> projectIds) {
		this.projectIds = projectIds;
	}
	
	
	
}
