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
	
	
//	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        BindingResult result = ex.getBindingResult();
//        // Construct a map to hold field errors
//        Map<String, String> errors = new HashMap<>();
//        for (FieldError error : result.getFieldErrors()) {
//            errors.put(error.getField(), error.getDefaultMessage());
//        }
//        // Return custom error response with field errors
//        return ResponseEntity.badRequest().body(errors);
//    }

}
