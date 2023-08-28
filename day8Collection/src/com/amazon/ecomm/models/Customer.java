package com.amazon.ecomm.models;

public class Customer {

	private long mobileNo;
	private String name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long mobileNo, String name) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public String getName() {
		return name;
	}
	
	
}
