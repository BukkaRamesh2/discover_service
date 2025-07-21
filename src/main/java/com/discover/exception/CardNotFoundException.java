package com.discover.exception;

public class CardNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -3794621595531594262L;
	
	public CardNotFoundException(String message) {
		super(message);
	}

}
