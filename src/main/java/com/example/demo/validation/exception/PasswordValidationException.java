package com.example.demo.validation.exception;

public class PasswordValidationException extends RuntimeException{
    public PasswordValidationException(String message) {
        super(message);
    }
}
