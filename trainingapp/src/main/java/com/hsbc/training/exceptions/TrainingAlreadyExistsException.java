package com.hsbc.training.exceptions;

public class TrainingAlreadyExistsException extends RuntimeException{

	private String message;

	public TrainingAlreadyExistsException(String message) {
		super();
		this.message = message;
	}
	
	
}
