package com.anonymizer.workspace.service;

import com.anonymizer.workspace.model.User;

public interface WorkspaceUserService {

    void addUserToWorkspace(final int workspaceId, final int usersId);
    User getWorkspaceOwner(final String projectName);
}
