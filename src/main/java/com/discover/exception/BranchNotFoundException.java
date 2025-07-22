package com.discover.exception;

public class BranchNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3794621595531594262L;
	
	public BranchNotFoundException(String message) {
		super(message);
	}
}
