package com.anonymizer.workspace.service;

import com.anonymizer.workspace.model.Project;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProjectService {
    Project createProject(Project project);
    List<Project> getAllProjects();
    Optional<Project> getProjectByName(String projectName);
    Project updateProject(Project project , int id);
    void deleteProject(String projectName);
    void deleteProjectById(int id);
    void deleteProjects(Collection<Project> projects);
}
