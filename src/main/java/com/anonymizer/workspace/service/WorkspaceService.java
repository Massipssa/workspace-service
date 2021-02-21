package com.anonymizer.workspace.service;

import com.anonymizer.workspace.model.Workspace;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface WorkspaceService {
    Workspace createWorkspace(Workspace workspace);
    List<Workspace> getAllWorkspaces();
    Optional<Workspace> getWorkspaceById(final int id);
    Optional<Workspace> getWorkspaceByName(final String workspaceName);
    Workspace updateWorkspace(Workspace workspace, final int id);
    void deleteWorkspace(String workspaceName);
    void deleteWorkspaceById(final int id);
    void deleteWorkspaces(Collection<Workspace> workspaces);
}
