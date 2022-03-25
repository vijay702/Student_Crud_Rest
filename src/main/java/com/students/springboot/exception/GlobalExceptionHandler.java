package com.students.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.students.springboot.model.ErrorMessage;

@RestControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity <ErrorMessage> departmentNotFoundException(StudentNotFoundException studentNotFoundException,
			                                        WebRequest webRequest) {
		
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND,studentNotFoundException.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		
		
	}
	
	
	

}
