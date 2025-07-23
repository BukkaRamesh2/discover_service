package com.discover.exception;

public class AccountNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 345L;

    public AccountNotFoundException(String message) {
        super(message);
    }
}
