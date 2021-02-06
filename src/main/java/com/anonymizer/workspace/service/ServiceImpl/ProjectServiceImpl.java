package com.anonymizer.workspace.service.ServiceImpl;

import com.anonymizer.workspace.model.Project;
import com.anonymizer.workspace.repository.ProjectRepository;
import com.anonymizer.workspace.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        project.setCreationTime(LocalDateTime.now());
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectByName(String projectName) {
        return projectRepository.findByProjectName(projectName);
    }

    @Override
    public Project updateProject(Project project, int id) {
        return null;
    }

    @Override
    public void deleteProject(String projectName) {

    }

    @Override
    public void deleteProjectById(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void deleteProjects(Collection<Project> projects) {
        projectRepository.deleteAll(projects);
    }
}
