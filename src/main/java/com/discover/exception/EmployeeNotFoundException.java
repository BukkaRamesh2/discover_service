package com.discover.exception;

public class EmployeeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 8763734258331970102L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
