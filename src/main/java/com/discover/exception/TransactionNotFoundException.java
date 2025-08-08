package com.discover.exception;

public class TransactionNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -3794621595531594262L;
	
	public TransactionNotFoundException(String message) {
		super(message);
	}

}
