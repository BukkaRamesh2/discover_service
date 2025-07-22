package com.discover.exception;

public class PaymentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 54354684654656486L;
	
	public PaymentNotFoundException(String message) {
		super(message);
	}


}
