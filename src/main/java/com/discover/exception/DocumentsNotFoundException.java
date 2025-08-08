package com.discover.exception;

public class DocumentsNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -3794621595531594262L;
	
	public DocumentsNotFoundException(String message) {
		super(message);
	}
}
