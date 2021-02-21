package com.anonymizer.workspace.repository;

import com.anonymizer.workspace.model.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, Integer> {

    Optional<Workspace> findByWorkspaceName(final String workspaceName);
}
