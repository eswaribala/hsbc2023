package com.hsbc.ecommerceapi.dtos;

public class ResponseWrapper<T> {
	
	private T object;
	private String message;
	
	public ResponseWrapper(T t) {
		this.object=t;
	}
	public ResponseWrapper(String message) {
		this.message=message;
	}
	public T getObject() {
		return object;
	}
	public String getMessage() {
		return message;
	}
	
	

}
