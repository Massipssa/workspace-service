package com.anonymizer.workspace.model;

import lombok.extern.slf4j.Slf4j;
/*import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;*/

import java.util.UUID;

@Slf4j
//@Aggregate
public class WorkspaceAggregate {

    //@AggregateIdentifier
    private UUID id;

    //@CommandHandler
    public WorkspaceAggregate(CreateWorkspaceCommand command) {

        // Notify the aggregate that new Workspace was created
        // by publishing new WorkspaceCreatedEvent
      /*  AggregateLifecycle.apply(
                new WorkspaceCreatedEvent(command.getId())
        );*/
    }

    /**
     *
     * Handles the event that was dispatched after the creation of the workspace
     */
    //@EventSourcingHandler
    public void on(WorkspaceCreatedEvent event) {
        this.id = event.getId();
    }

}
