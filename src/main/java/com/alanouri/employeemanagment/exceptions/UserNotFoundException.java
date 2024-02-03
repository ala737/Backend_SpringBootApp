package com.alanouri.employeemanagment.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String s) {
        super(s);
    }
}
