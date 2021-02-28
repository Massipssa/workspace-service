package com.anonymizer.workspace.controller;

import com.anonymizer.workspace.model.User;
import com.anonymizer.workspace.service.WorkspaceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/workspace")
public class UserWorkspaceController {

    @Autowired
    WorkspaceUserService workspaceUserService;

    @GetMapping(path = "/user/{workspaceName}")
    public User getWorkspaceOwner(@PathVariable("workspaceName") String workspaceName) {
        return this.workspaceUserService.getWorkspaceOwner(workspaceName);
    }

    @PostMapping(path = "/user/{workspaceId}/{userId}")
    public void addUserToWorkspace(@PathVariable("workspaceId") int workspaceId, @PathVariable("userId") int userId) {
        this.workspaceUserService.addUserToWorkspace(workspaceId, userId);
    }

}
