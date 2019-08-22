package com.teletronics.project.model;

import lombok.Data;

@Data
public class Project {
	private Long projectId;
	private String projectUrl;
	private String projectTitle;
	
	public Project(Long projectId, String projectUrl, String projectTitle) {
		super();
		this.projectId = projectId;
		this.projectUrl = projectUrl;
		this.projectTitle = projectTitle;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
}
