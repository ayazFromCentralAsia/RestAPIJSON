package com.example.RestAPISecond.Util;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException() {
    }

    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}