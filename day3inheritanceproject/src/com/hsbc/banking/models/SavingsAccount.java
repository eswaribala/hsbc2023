package com.hsbc.banking.models;

import java.time.LocalDate;
import java.util.Random;

public class SavingsAccount extends Account{

	private float interestRate;
	
	public SavingsAccount(LocalDate doc, long runningTotal) {
		super(doc, runningTotal);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String generateAccountNo() {
		// TODO Auto-generated method stub
		return "S"+new Random().nextInt(10000000);
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	
	
}
