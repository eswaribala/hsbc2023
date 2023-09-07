package com.hsbc.springcoredemo.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;


public class Customer {
	
	private long customerId;
	private String name;	
	private List<Account> accounts;
	
	
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

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
