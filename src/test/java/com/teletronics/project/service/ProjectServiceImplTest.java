package com.teletronics.project.service;

import static com.teletronics.project.test.utils.TestUtils.mockProjectDetails;
import static com.teletronics.project.test.utils.TestUtils.mockUser;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.teletronics.project.dao.ProjectDaoImpl;


@DisplayName("ServiceImplTest")
@ExtendWith(SpringExtension.class)
public class ProjectServiceImplTest {

	private final String userName = "muzeeb";
	private final Long projectId=(long) 10001;

	@InjectMocks
	private ProjectServiceImpl projectService;

	@Mock
	private ProjectDaoImpl projectDaoImpl;

	@BeforeEach
	void setMockOutput() {
		
		when(projectDaoImpl.getUserProjects(Mockito.anyString())).thenReturn(mockUser());
		when(projectDaoImpl.getProjectDetails(userName, projectId)).thenReturn(mockProjectDetails());
	}

	@Test
	@DisplayName("When Valid Name then User Should be Found")
	public void whenValidName_thenUserShouldbeFound() {
		assertTrue(projectService.getUserProjects(userName).getUserName().equalsIgnoreCase(userName));
	}

	@Test
	@DisplayName("When Valid User then User Object Should Not be Null")
	public void whenValidUser_thenUserObjectShouldNotbeNull() {
		assertNotNull(projectService.getUserProjects(userName));
	}
	
	@Test
	@DisplayName("When Valid Project id then Project Details Should be Found")
	public void whenProjectId_thenProjectDetailsShouldBeFound() {
		assertTrue(projectService.getProjectDetails(userName,projectId).getProjectId().equals(projectId));
	}
	
	@Test
	@DisplayName("When Valid Project id then Project Details Object Should Not be Null")
	public void whenProjectId_thenProjectDetailsObjectShouldNotBeNull() {
	assertNotNull(projectService.getProjectDetails(userName,projectId));
	}

}
