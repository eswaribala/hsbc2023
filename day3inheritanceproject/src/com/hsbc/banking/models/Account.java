package com.hsbc.banking.models;

import java.time.LocalDate;

public abstract class Account {

	protected String accountNo;
	protected LocalDate doc;
	protected long runningTotal;	
	public abstract String generateAccountNo();
	
	
	public Account(LocalDate doc, long runningTotal) {
		super();
		this.accountNo = generateAccountNo();
		this.doc = doc;
		this.runningTotal = runningTotal;
	}




	public String getAccountNo() {
		return accountNo;
	}
	public LocalDate getDoc() {
		return doc;
	}
	public long getRunningTotal() {
		return runningTotal;
	}
	
	
}
