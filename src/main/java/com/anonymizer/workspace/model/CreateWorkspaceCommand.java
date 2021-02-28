package com.anonymizer.workspace.model;

import lombok.Data;
//import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
public class CreateWorkspaceCommand {

    //@TargetAggregateIdentifier
    private UUID id;
}
