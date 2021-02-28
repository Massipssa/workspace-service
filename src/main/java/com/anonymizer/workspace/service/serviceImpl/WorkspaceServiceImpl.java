package com.anonymizer.workspace.service.serviceImpl;

import com.anonymizer.workspace.model.Workspace;
import com.anonymizer.workspace.repository.WorkspaceRepository;
import com.anonymizer.workspace.service.WorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {

    @Autowired
    private WorkspaceRepository workspaceRepository;

    @Override
    public Workspace createWorkspace(Workspace workspace) {
        //workspace.setCreationTime(LocalDateTime.now());
        //workspace.setUpdateTime(LocalDateTime.now());
        return workspaceRepository.save(workspace);
    }

    @Override
    public List<Workspace> getAllWorkspaces() {
        return workspaceRepository.findAll();
    }

    @Override
    public Optional<Workspace> getWorkspaceById(int id) {
        return workspaceRepository.findById(id);
    }

    @Override
    public Optional<Workspace> getWorkspaceByName(String workspaceName) {
        return workspaceRepository.findByWorkspaceName(workspaceName);
    }

    @Override
    public Workspace updateWorkspace(Workspace workspace, int id) {

        return workspaceRepository.findById(id)
                .map(u -> {
                    u = workspace;
                    return workspaceRepository.save(u);
                })
                .orElse(null);
    }

    @Override
    public void deleteWorkspace(String workspaceName) {

    }

    @Override
    public void deleteWorkspaceById(int id) {
        workspaceRepository.deleteById(id);
    }

    @Override
    public void deleteWorkspaces(Collection<Workspace> workspaces) {
        workspaceRepository.deleteAll(workspaces);
    }

}
