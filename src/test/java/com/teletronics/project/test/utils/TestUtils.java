package com.teletronics.project.test.utils;

import java.util.Arrays;
import java.util.List;

import com.teletronics.project.model.Contributor;
import com.teletronics.project.model.Project;
import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;

public class TestUtils {
	
	public static User mockUser() {
		Project muzeebProject1 = new Project((long) 10001, "http://localhost:8080//api/projects/muzeeb/10001", "Muzeeb-Project1-Titile");
		Project muzeebProject2 = new Project((long) 10002, "http://localhost:8080//api/projects/muzeeb/10002", "Muzeeb-Project2-Titile");
		Project muzeebProject3 = new Project((long) 10003, "http://localhost:8080//api/projects/muzeeb/10003", "Muzeeb-Project3-Titile");
		Project muzeebProject4 = new Project((long) 10004, "http://localhost:8080//api/projects/muzeeb/10004", "Muzeeb-Project4-Titile");		
		List<Project> muzeebProjects = Arrays.asList(muzeebProject1, muzeebProject2, muzeebProject3, muzeebProject4);
		User userMuzeeb = new User("Muzeeb", muzeebProjects);
		return  userMuzeeb;
		
	}
	
	public static  ProjectDetails mockProjectDetails() {
		List<Long> projectIds =Arrays.asList((long) 10001,(long) 10002); 

		Contributor contributor1 = new Contributor((long) 90001, "contributor1name",projectIds);
		Contributor contributor2 = new Contributor((long) 90001, "contributor2name",projectIds);
		List<Contributor> contributors;
		contributors=Arrays.asList(contributor1,contributor2);
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectId((long) 10001);
		projectDetails.setContributors(contributors);
		projectDetails.setTotalCommits((long) 30);		
		return projectDetails;
		
	}

}
