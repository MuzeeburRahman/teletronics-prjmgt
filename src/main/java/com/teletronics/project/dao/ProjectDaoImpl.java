package com.teletronics.project.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.teletronics.project.model.Contributor;
import com.teletronics.project.model.Project;
import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	static List<User> users;
	static List<Contributor> contributors;
	

	static {
		Project muzeebProject1 = new Project((long) 10001, "http://localhost:8080//api/projects/muzeeb/10001", "Muzeeb-Project1-Titile");
		Project muzeebProject2 = new Project((long) 10002, "http://localhost:8080//api/projects/muzeeb/10002", "Muzeeb-Project2-Titile");
		Project muzeebProject3 = new Project((long) 10003, "http://localhost:8080//api/projects/muzeeb/10003", "Muzeeb-Project3-Titile");
		Project muzeebProject4 = new Project((long) 10004, "http://localhost:8080//api/projects/muzeeb/10004", "Muzeeb-Project4-Titile");
		
		Project rahmanProject1 = new Project((long) 20001, "http://localhost:8080//api/projects/rahman/20001", "Rahman-Project1-Titile");
		Project rahmanProject2 = new Project((long) 20002, "http://localhost:8080//api/projects/rahman/20002", "Rahman-Project2-Titile");
		Project rahmanProject3 = new Project((long) 20003, "http://localhost:8080//api/projects/rahman/20003", "Rahman-Project3-Titile");
		Project rahmanProject4 = new Project((long) 20004, "http://localhost:8080//api/projects/rahman/20004", "Rahman-Project4-Titile");
		
		Project farooqiProject1 = new Project((long) 30001, "http://localhost:8080//api/projects/farooqi/30001", "Farooqi-Project1-Titile");
		Project farooqiProject2 = new Project((long) 30002, "http://localhost:8080//api/projects/farooqi/30002", "Farooqi-Project2-Titile");
		Project farooqiProject3 = new Project((long) 30003, "http://localhost:8080//api/projects/farooqi/30003", "Farooqi-Project3-Titile");
		Project farooqiProject4 = new Project((long) 30004, "http://localhost:8080//api/projects/farooqi/30004", "Farooqi-Project4-Titile");
		
		List<Project> muzeebProjects = Arrays.asList(muzeebProject1, muzeebProject2, muzeebProject3, muzeebProject4);
		List<Project> rahmanProjects = Arrays.asList(rahmanProject1, rahmanProject2, rahmanProject3, rahmanProject4);
		List<Project> farooqiProjects = Arrays.asList(farooqiProject1, farooqiProject2, farooqiProject3, farooqiProject4);

		User userMuzeeb = new User("Muzeeb", muzeebProjects);
		User userRahman = new User("Rahman", rahmanProjects);
		User userFarooqi = new User("Farooqi", farooqiProjects);
		
		users = Arrays.asList(userMuzeeb, userRahman, userFarooqi);
		List<Long> projectIds =Arrays.asList(muzeebProject1.getProjectId(),farooqiProject1.getProjectId()); 
		List<Long> projectIds1 =Arrays.asList(rahmanProject3.getProjectId(),farooqiProject4.getProjectId()); 

		Contributor contributor1 = new Contributor((long) 90001, "contributor1name",projectIds);
		Contributor contributor2 = new Contributor((long) 90002, "contributor2name",projectIds1);
		contributors=Arrays.asList(contributor1,contributor2);
		
	}

	@Override
	public User getUserProjects(String userName) {

		return users.stream().filter(usr -> usr.getUserName().equalsIgnoreCase(userName)).findAny().orElse(null);
	}

	@Override
	public ProjectDetails getProjectDetails(String userName, Long projectId) {
		
		List<Contributor> projectContributors = contributors.stream()
				.filter(conb -> conb.getProjectIds().contains(projectId)).collect(Collectors.toList());
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectId(projectId);
		projectDetails.setContributors(projectContributors);
		projectDetails.setTotalCommits((long) 30);		
		
		return projectDetails;
	}

}
