package com.anonymizer.workspace.service;

import com.anonymizer.workspace.model.User;
import com.anonymizer.workspace.model.Workspace;

public interface WorkspaceUserService {

    void addUserToWorkspace(final int workspaceId, final int usersId);
    User getWorkspaceOwner(final String projectName);
}
