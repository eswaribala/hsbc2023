package com.hsbc.banking.models;

import java.time.LocalDate;

public class Individual extends Customer{

	public String type;
	static{
	     // System.out.println("sub class static block");
		}
	
	private LocalDate dob;
	private Gender gender;
	{
	      //System.out.println("Sub class instance block");
		}
	public Individual() {
		super();
		// TODO Auto-generated constructor stub
		 //System.out.println("Sub class default constructor");
	}
	public Individual(long customerId, FullName name, Address[] addresses, String email, String password,
			long contactNo, LocalDate dob, Gender gender) {
		super(customerId, name, addresses, email, password, contactNo);
		// TODO Auto-generated constructor stub
		this.dob=dob;
		this.gender=gender;
		 //System.out.println("Sub class param constructor");
		
	}
	public LocalDate getDob() {
		return dob;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	
	
	
	
	
}
