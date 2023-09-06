package com.hsbc.exceptions;

public class OrderDateException extends RuntimeException{

	private String message;

	public OrderDateException(String message) {
		super();
		this.message = message;
	}
	
	
}
