package com.hsbc.banking.models;

import java.util.Arrays;

public class Customer {
	
	public  String type;

	static{
     // System.out.println("Super class static block");
	}
	protected long customerId;
	//value object
	protected FullName name;
	//has relationship
	protected Address[] addresses;
	protected String email;
	protected String password;
	protected long contactNo;
	public static boolean active;
	
	{
		//System.out.println("Super class instance block");
	}
	public Customer(long customerId, FullName name, Address[] addresses, String email, String password,
			long contactNo) {
		super();
		 //System.out.println("Super class param constructor");
		this.customerId = customerId;
		this.name = name;
		this.addresses = addresses;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
	}
	public Customer() {
		super();
		 //System.out.println("Super class default constructor");
		// TODO Auto-generated constructor stub
	}
	public long getCustomerId() {
		return customerId;
	}
	
	public FullName getName() {
		return name;
	}
	
	public Address[] getAddresses() {
		return addresses;
	}
	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer customer=(Customer) obj;
		return this.password.equals(customer.password);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", addresses=" + Arrays.toString(addresses)
				+ ", email=" + email + ", password=" + password + ", contactNo=" + contactNo + "]";
	}
	
	public final void message() {
		
	}
	
}
