/**
 * 
 */
package com.users.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author sudipkumarshaw
 *
 */
@ControllerAdvice
public class GlobalCustomeException extends ResponseEntityExceptionHandler {

	/**
	 * 
	 */
	public GlobalCustomeException() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler(CustomeException.class)
	protected ResponseEntity<?> requestNotfoundException(CustomeException customeException) {
		// TODO Auto-generated method stub
		System.out.println("Run time exception");
//		return super.createResponseEntity(body, headers, statusCode, request);
		return new ResponseEntity<Object>(customeException.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	

}
