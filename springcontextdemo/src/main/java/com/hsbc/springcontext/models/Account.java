package com.hsbc.springcontext.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value = "savingsAccount")
@Scope("prototype")
public class Account {
	
	private long accountNo;
	private long runningTotal;
	@Autowired
	//@Qualifier(value = "bank1")
    private Bank bank;
    
    //@Autowired
    public Account(Bank bank) {
    	this.bank=bank;
    }

	
	public Bank getBank() {
		return bank;
	}

    //@Autowired(required = false)
	public void setBank(Bank bank) {
		this.bank = bank;
	}

    public Account() {
    	
    }
	public Account(long accountNo, long runningTotal) {
		super();
		this.accountNo = accountNo;
		this.runningTotal = runningTotal;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getRunningTotal() {
		return runningTotal;
	}
	public void setRunningTotal(long runningTotal) {
		this.runningTotal = runningTotal;
	}
	
	

}
