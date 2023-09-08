package com.hsbc.banklib.models;

public class Address {
	
	private String doorNo;
	private String streetName;
	private String city;
	public Address(String doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
