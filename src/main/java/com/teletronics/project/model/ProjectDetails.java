package com.teletronics.project.model;

import java.util.List;

public class ProjectDetails {
	
	private Long projectId;
	private List<Contributor> contributors;
	private Long totalCommits;
	private String projectDesc;
	
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public List<Contributor> getContributors() {
		return contributors;
	}
	public void setContributors(List<Contributor> contributors) {
		this.contributors = contributors;
	}
	public Long getTotalCommits() {
		return totalCommits;
	}
	public void setTotalCommits(Long totalCommits) {
		this.totalCommits = totalCommits;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	
}
