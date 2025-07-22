package com.discover.exception;

public class AddressNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -3794621595531594262L;
	
	public AddressNotFoundException(String message) {
		super(message);
	}

}
