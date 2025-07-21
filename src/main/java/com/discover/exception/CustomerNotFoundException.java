package com.discover.exception;

public class CustomerNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -3794621595531594262L;
	
	public CustomerNotFoundException(String message) {
		super(message);
	}

}
