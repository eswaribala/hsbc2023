package com.hsbc.banking.models;

public class Person {

	protected String adharCardNo;
	protected String name;
	public Person(String adharCardNo, String name) {
		super();
		this.adharCardNo = adharCardNo;
		this.name = name;
	}
	public String getAdharCardNo() {
		return adharCardNo;
	}
	public String getName() {
		return name;
	}
	
	
}
