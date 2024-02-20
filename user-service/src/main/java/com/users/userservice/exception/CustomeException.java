/**
 * 
 */
package com.users.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class CustomeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public CustomeException() {
		// TODO Auto-generated constructor stub
	}

	private String message;
	private HttpStatus httpStatus;
	private Object object;

	
	
	public String getMessage() {
		return message;
	}
	
	public Object getObject() {
		return object;
	}
	
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	public CustomeException(String message) {
		this.message = message;
	}

	public CustomeException(String message, HttpStatus httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public CustomeException(String message, HttpStatus httpStatus, Object object) {
		this.message = message;
		this.httpStatus = httpStatus;
		this.object = object;
	}

}
