package com.anonymizer.workspace.model;

import lombok.Data;

import java.util.UUID;

@Data
public class WorkspaceCreatedEvent {
    private final UUID id;
}
