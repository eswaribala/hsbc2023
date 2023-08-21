package com.hsbc.banking.models;

import java.time.LocalDate;
import java.util.Random;

public class CurrentAccount extends Account{

	private long odLimit;	
	
	public CurrentAccount(LocalDate doc, long runningTotal) {
		super(doc, runningTotal);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String generateAccountNo() {
		// TODO Auto-generated method stub
		return "C"+new Random().nextInt(10000000);
	}

	public long getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(long odLimit) {
		this.odLimit = odLimit;
	}

}
