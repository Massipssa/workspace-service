package com.anonymizer.workspace.exception;

import java.util.UUID;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(UUID id) {
        super("Cannot found user with id:  [" + id + "]");
    }
}
