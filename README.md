# Teletronics-Test Project Description
1. Setup a GitHub project
2. Create a Spring Boot service that exposes a REST API on port 80.
3. Add an endpoint /projects/<username> which respond with a JSON document containing the user’s name and a list of projects. Each project should contain the URL and title of the project and some kind of id.
4. Add an endpoint /projects/<username>/<project_id> which respond with a JSON document a 50 word excerpt from the project’s readme.md, list of contributors and number of total commits.
5. Create automated tests for the service - consider edge-cases.
6. Setup a Continuous Integration for GitHub, that runs the tests and build a docker image.
7. Add content negotiation to your 2 endpoints allowing the API to be requested to reply with either application/json or application/xml.
8. Make a readme.MD file that describes how to setup for development, run tests, and build/ run the docker service. Basically anything that will allow us to easier navigate and test out your project.

## Overview
* [Technology Stack](#technology-stack)
* [Installation Required](#installation-required)
* [Running Project](#running-project)
* [About Muzeeb ur Rahman Farooqi](#about-Muzeeb-ur-Rahman-Farooqi)

### Continuous Integration(CI)
  **Commit & push will push the code to github repo ->Travis automatically pulls repo ->Travis builds a test image, test code-> upon success -> Travis build prod image -> travis pushes built prod image to Docker Hub

## Technology Stack
  - Java8
  - SpringBoot
  - Mockito
  - Docker
  - Travis-ci
  - Gradle

## Installation Required
  - Java8
  - Docker
  - Eclipse
  - Account in Docker & Travis-ci

## Running Project
  - Pull or clone project from github  
  - Uncomment the code in Dockerfile.dev file
  - Navigate to project root folder in terminal
  - Build docker image -> docker build -t muzeeburrahman/tele-prj -f Dockerfile.dev . 
  - Run docker Image -> docker run muzeeburrahman/tele-prj:latest
  - open browser or postman or Restlet client past the below urls
  - http://localhost:80/api/projects/muzeeb
  - http://localhost:8001/api/projects/muzeeb/10001
  - Headers:
  - Accept      :application/xml
  - Content-Type:application/josn

## About Muzeeb ur Rahman Farooqi
   10 years of experience in IT industry in application and product development using Java/J2EE, Angular, AWS and Expertise in all phases of system development life cycle Process (SDLC), Agile Software Development, Scrum Methodology, Test-Driven Development,BDD and CI/CD.
  - Email: f.muzeeb18@gmail.com
  - Linkedin: https://www.linkedin.com/in/muzeeb-ur-rahman/
