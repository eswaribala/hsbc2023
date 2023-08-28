package com.amazon.ecommerce.exceptions;

public class DiskAccessException extends Exception{

	private String message;
//IOexception will be rethrown as disk access exception 
	public DiskAccessException(String message) {
		super();
		this.message = message;
	}
	
	
}
