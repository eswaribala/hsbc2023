package com.amazon.ecommerce.exceptions;

public class ProductException extends RuntimeException{

	private String message;

	public ProductException(String message) {
		super();
		this.message = message;
	}
	
}
