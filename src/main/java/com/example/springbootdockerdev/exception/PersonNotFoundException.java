package com.example.springbootdockerdev.exception;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(Long id) {
        super("Could not find person " + id);
    }
}
