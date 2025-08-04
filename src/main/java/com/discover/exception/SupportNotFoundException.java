package com.discover.exception;

public class SupportNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 7854963587459854789L;
	
	public SupportNotFoundException(String message) {
		super(message);
	}

}
