package com.hsbc.springcontext.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@Import(Customer.class) //import address bean from customer
public class Bank {

	private String bankCode;
	private String bankName;
	public Bank(String bankCode, String bankName) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
}
