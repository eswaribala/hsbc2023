package com.hsbc.banking.models;

import java.util.Arrays;
import java.util.Random;

public class Customer implements Cloneable{
	
	private long customerId;
	private String name;
	private String email;
	private String password;
	public Customer(long customerId) {
		super();
		this.customerId = customerId;
	}
	
	
	public Customer(String name, String email) {
		
		this(generateCustomerId());
		this.name = name;
		this.email = email;
		
		
	}


	public Customer(long customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}
	public Customer(long customerId, String name, String email, String password) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	private static long generateCustomerId() {
		return new Random().nextInt(10000);
	}


	public long getCustomerId() {
		return customerId;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	
	
	
	
}
