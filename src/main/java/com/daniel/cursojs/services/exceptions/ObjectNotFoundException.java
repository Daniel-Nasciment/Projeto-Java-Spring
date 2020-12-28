package com.daniel.cursojs.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String msg) {
		
	}
	
	public ObjectNotFoundException (String msg, Throwable cause) {
		
		super(msg, cause);
		
	}

}
