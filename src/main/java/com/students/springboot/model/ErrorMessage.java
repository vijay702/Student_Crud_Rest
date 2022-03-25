package com.students.springboot.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private HttpStatus status;
	
	private String message;

	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	
	
	public ErrorMessage() {
		
	}

}
