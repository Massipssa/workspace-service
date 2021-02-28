package com.anonymizer.workspace.model;

import com.anonymizer.workspace.repository.WorkspaceRepository;
//import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceProjection {

    @Autowired
    private WorkspaceRepository workspaceRepository;

//    @EventHandler
    public void on(WorkspaceCreatedEvent event) {
        // create new workspace from event data
        // save the workspace using repository
    }
}
