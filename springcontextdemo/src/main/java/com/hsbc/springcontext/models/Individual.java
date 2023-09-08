package com.hsbc.springcontext.models;

import java.util.Date;

public class Individual extends Customer{
	
	private Date dob;
	private Gender gender;
	
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Individual(Date dob, Gender gender) {
		super();
		this.dob = dob;
		this.gender = gender;
	}

	public Individual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Individual(long customerId, String name) {
		super(customerId, name);
		// TODO Auto-generated constructor stub
	}
	
	public Individual(long customerId, String name,Date dob, Gender gender) {
		super(customerId, name);
		// TODO Auto-generated constructor stub
		this.dob = dob;
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
