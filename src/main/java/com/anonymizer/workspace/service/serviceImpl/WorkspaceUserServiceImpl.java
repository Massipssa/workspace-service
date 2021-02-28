package com.anonymizer.workspace.service.serviceImpl;

import com.anonymizer.workspace.model.User;
import com.anonymizer.workspace.model.Workspace;
import com.anonymizer.workspace.service.WorkspaceService;
import com.anonymizer.workspace.service.WorkspaceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Optional;

@Service
public class WorkspaceUserServiceImpl implements WorkspaceUserService {

    @Autowired
    private WorkspaceService workspaceService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void addUserToWorkspace(final int workspaceId, final int usersId) {

        Optional<Workspace> workspace = workspaceService.getWorkspaceById(workspaceId);
        if(workspace.isPresent()) {
            workspace.get().getUsersId().add(usersId);
            workspaceService.updateWorkspace(workspace.get(), workspaceId);
        }
    }

    // TODO: how to use config here ??

    @Override
    public User getWorkspaceOwner(final String workspaceName) {
        Optional<Workspace> workspace = workspaceService.getWorkspaceByName(workspaceName);
        if(workspace.isPresent()) {
            int ownerId = workspace.get().getOwnerId();
            URI uri = URI.create(String.format("http://localhost:9191/api/v1/auth/user/id/%d", ownerId));
            return restTemplate.getForObject(uri, User.class);
        }
        return null;
    }
}
