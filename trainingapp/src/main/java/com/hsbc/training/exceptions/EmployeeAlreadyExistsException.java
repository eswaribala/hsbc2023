package com.hsbc.training.exceptions;

public class EmployeeAlreadyExistsException extends RuntimeException{

	private String message;

	public EmployeeAlreadyExistsException(String message) {
		super();
		this.message = message;
	}
	
	
}
