package com.teletronics.project.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teletronics.project.model.ProjectDetails;
import com.teletronics.project.model.User;
import com.teletronics.project.service.ProjectService;

import io.swagger.annotations.ApiOperation;
/**
 * This is the Controller class for Listing Projects and its Details of a User.
 * 
 * @author Muzeeb ur Rahman Farooqi
 * @version 1.0
 */
@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	/**
	 * Fetching the list of projects for a user
	 * 
	 * @param userName
	 * @throws customException
	 * @return List<Project>
	 */	
	@ApiOperation("Get the list of Projects for a User")
	@GetMapping(path="/api/projects/{username}",produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public User getUserProjects(@PathVariable("username") @NotNull String userName ) {
		return projectService.getUserProjects(userName);
	}
	
	/**
	 * Fetching project details 
	 * 
	 * @param userName ,projectId
	 * @throws customException
	 * @return List<ProjectDetails>
	 */	
	@GetMapping(path="api/projects/{username}/{project-id}",produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ProjectDetails getProjectDetails(@PathVariable("username") @NotNull final String  userName,
									 @PathVariable("project-id") @NotNull final Long projectId) {
		System.out.println("Project details");
		return projectService.getProjectDetails(userName, projectId);
	}
}
