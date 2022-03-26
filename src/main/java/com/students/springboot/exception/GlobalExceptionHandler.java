package com.students.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.students.springboot.model.ErrorMessage;

@RestControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> studentNotFoundException(StudentNotFoundException studentNotFoundException, WebRequest webRequest) {
		
		
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,studentNotFoundException.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
		
	}

}
