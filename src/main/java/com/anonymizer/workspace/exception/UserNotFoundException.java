package com.anonymizer.workspace.exception;

import java.util.UUID;

public class UserNotFoundException extends Throwable {

    public UserNotFoundException(UUID id) {
        super("Cannot found user with id:  [" + id + "]");
    }
}
