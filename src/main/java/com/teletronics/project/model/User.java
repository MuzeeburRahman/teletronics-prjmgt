package com.teletronics.project.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
	private String userName;
	private List<Project> Projects;
	
	public User(String userName, List<Project> projects) {
		super();
		this.userName = userName;
		Projects = projects;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Project> getProjects() {
		return Projects;
	}

	public void setProjects(List<Project> projects) {
		Projects = projects;
	}
	
}
