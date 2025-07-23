package com.discover.exception;

public class FeeNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3794621595531594262L;

    public FeeNotFoundException(String message) {
        super(message);
    }
}
