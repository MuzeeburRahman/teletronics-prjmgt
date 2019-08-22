package com.teletronics.project.dao;

import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;

public interface ProjectDao {
	
	User getUserProjects(final String userName);
	ProjectDetails getProjectDetails(final String userName,final Long projectId);

}
