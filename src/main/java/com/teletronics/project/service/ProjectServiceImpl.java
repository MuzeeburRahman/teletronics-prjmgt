package com.teletronics.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teletronics.project.dao.ProjectDao;
import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;
import com.teletronics.project.utils.FileReaderUtil;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectRepository;


	@Override
	public User getUserProjects(final String userName) {
		return projectRepository.getUserProjects(userName);
	}

	@Override
	public ProjectDetails getProjectDetails(final String userName,final Long projectId) {
		FileReaderUtil fileReaderUtil =new FileReaderUtil();
		ProjectDetails projectDetails =new ProjectDetails();
		projectDetails=projectRepository.getProjectDetails(userName, projectId);
		projectDetails.setProjectDesc(fileReaderUtil.readFile());
		return projectDetails;
	}

}
