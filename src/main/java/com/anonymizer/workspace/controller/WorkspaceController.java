package com.anonymizer.workspace.controller;

import com.anonymizer.workspace.model.Workspace;
import com.anonymizer.workspace.service.WorkspaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Optional;


// TODO: who to manage crossOrigin

@RestController
@RequestMapping("/api/v1/workspace")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkspaceController {

    private static final Logger LOG = LoggerFactory.getLogger(WorkspaceController.class);

    @Autowired
    private WorkspaceService workspaceService;

    @PostMapping(path = "/workspace")
    public Workspace addWorkspace(@Valid @NotNull @RequestBody Workspace workspace) {
        LOG.info("workspace name: {}", workspace.getWorkspaceName());
        return workspaceService.createWorkspace(workspace);
    }

    @GetMapping(path = "/workspaces")
    public Collection<Workspace> getAllWorkspaces() {
        return workspaceService.getAllWorkspaces();
    }

    @GetMapping(path = "/workspace/{workspaceName}")
    public Optional<Workspace> getWorkspaceByName(@PathVariable("workspaceName") String workspaceName) {
        return workspaceService.getWorkspaceByName(workspaceName);
    }

    @DeleteMapping(path = "/workspace/{id}")
    public void deleteWorkspaceById(@PathVariable("id") int id) {
        workspaceService.deleteWorkspaceById(id);
    }

    @DeleteMapping(path = "/workspace")
    public void deleteWorkspaces(@RequestBody Collection<Workspace> workspaces) {
        workspaceService.deleteWorkspaces(workspaces);
    }
}
