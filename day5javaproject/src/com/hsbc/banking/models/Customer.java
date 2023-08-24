package com.hsbc.banking.models;

//name should be in alphabets else throw exception
public class Customer {
	
	private long customerId;
	private String name;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
