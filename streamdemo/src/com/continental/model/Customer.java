package com.continental.model;
import java.util.Date;

public class Customer {

	private int customerId;
	private String name;
	private Date dob;
	
	
	public Customer(int customerId, String name, Date dob) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
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
