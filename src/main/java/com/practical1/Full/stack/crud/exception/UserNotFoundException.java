package com.practical1.Full.stack.crud.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id){
        super("User not found the user with id " + id);
    }
}
