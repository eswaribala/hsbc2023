package com.hsbc.springcoredemo.models;

public class Account {
	
	private long accountNo;
	private long runningTotal;
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
