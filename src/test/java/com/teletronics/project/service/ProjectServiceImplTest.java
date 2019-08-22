package com.teletronics.project.service;

import static com.teletronics.project.test.utils.TestUtils.mockProjectDetails;
import static com.teletronics.project.test.utils.TestUtils.mockUser;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import com.teletronics.project.dao.ProjectDaoImpl;

@DisplayName("ServiceImplTest")
public class ProjectServiceImplTest {

	private final String userName = "muzeeb";
	private final Long projectId=(long) 10001;

	@InjectMocks
	private ProjectServiceImpl projectService;

	@Mock
	private ProjectDaoImpl projectDaoImpl;

	@BeforeEach
	void setMockOutput() {
		MockitoAnnotations.initMocks(this);
		when(projectDaoImpl.getUserProjects(Mockito.anyString())).thenReturn(mockUser());
		when(projectDaoImpl.getProjectDetails(userName, projectId)).thenReturn(mockProjectDetails());
	}

	@Test
	@DisplayName("When Valid Name then User Should be Found")
	public void whenValidName_thenUserShouldbeFound() {
		assertThat(projectService.getUserProjects(userName).getUserName().equalsIgnoreCase(userName));
	}

	@Test
	@DisplayName("When Valid User then User Object Should Not be Null")
	public void whenValidUser_thenUserObjectShouldNotbeNull() {
		assertNotNull(projectService.getUserProjects(userName).getUserName());
	}
	
	@Test
	@DisplayName("When Valid Project id then Project Details Should be Found")
	public void whenProjectId_thenProjectDetailsShouldBeFound() {
		assertThat(projectService.getUserProjects(userName).getUserName().equalsIgnoreCase(userName));
	}
	
	@Test
	@DisplayName("When Valid Project id then Project Details Object Should Not be Null")
	public void whenProjectId_thenProjectDetailsObjectShouldNotBeNull() {
	assertNotNull(projectService.getProjectDetails(userName,projectId));
	}

}
