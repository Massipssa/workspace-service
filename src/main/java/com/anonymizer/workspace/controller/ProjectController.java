package com.anonymizer.workspace.controller;

import com.anonymizer.workspace.model.Project;
import com.anonymizer.workspace.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    private static final Logger LOG = LoggerFactory.getLogger(ProjectController.class);

    @Autowired
    ProjectService projectService;

    @PostMapping(path = "/api/v1/workspace/project")
    public Project addProject(@Valid @NotNull @RequestBody Project project) {
        LOG.info(String.format("Project name: {}", project.getProjectName()));
        return projectService.createProject(project);
    }

    @GetMapping(path = "/api/v1/workspace/projects")
    public Collection<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping(path = "/api/v1/workspace/project/{projectName}")
    public Optional<Project> getProjectByProjectName(@PathVariable("projectName") String projectName) {
        return projectService.getProjectByName(projectName);
    }

    @DeleteMapping(path = "/api/v1/workspace/project/{id}")
    public void deleteProjectById(@PathVariable("id") int id) {
        projectService.deleteProjectById(id);
    }

    @DeleteMapping(path = "/api/v1/workspace/project")
    public void deleteProjects(@RequestBody Collection<Project> projects) {
        projectService.deleteProjects(projects);
    }
}
