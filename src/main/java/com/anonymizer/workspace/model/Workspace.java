package com.anonymizer.workspace.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "workspaces")
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int ownerId;
    private String workspaceName;
    private String description;
    private String directoryPath;
    private LocalDateTime creationTime = LocalDateTime.now();
    private LocalDateTime updateTime = LocalDateTime.now();

    @ElementCollection
    @CollectionTable(name = "workspace_users", joinColumns = @JoinColumn(name = "workspace_id"))
    @Column(name = "user_id")
    private Set<Integer> usersId;
}
