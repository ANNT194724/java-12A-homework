package com.example.courseapi.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String s) {
        super(s);
    }
}