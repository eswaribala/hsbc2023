package com.hsbc.springcoredemo.models;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.context.annotation.Scope;

public class Customer {
	
	private long customerId;
	private String name;
	private Date dob;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String name, Date dob) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	

}
