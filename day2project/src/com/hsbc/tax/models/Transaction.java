package com.hsbc.tax.models;

public class Transaction {
	
	private Transaction() {
		
	}
	
	public static Transaction getTransactionInstance() {
		return new Transaction();
	}

}
