package com.teletronics.project.service;

import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;

public interface ProjectService {
	
	User getUserProjects(final String userName);
	ProjectDetails getProjectDetails(final String userName,Long projectId);
	

}
