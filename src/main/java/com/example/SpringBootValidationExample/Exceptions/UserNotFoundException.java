package com.example.SpringBootValidationExample.Exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String msg) {
        super(msg);
    }
    
}
