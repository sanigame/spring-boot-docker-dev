package com.example.springbootdockerdev.exception;

public class EmailExistsException extends RuntimeException {
    public EmailExistsException(String email) {
        super("Email " + email + " already exists");
    }
}
