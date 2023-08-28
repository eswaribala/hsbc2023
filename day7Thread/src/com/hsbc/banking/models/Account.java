package com.hsbc.banking.models;

public class Account {
	
	private long balance;	
	public Account(long amount) {
		this.balance=amount;
	}	
	public long withdraw(int amount) {
		if(balance>amount) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance=balance-amount;			
		}
		else
		{
			System.out.println("No sufficient balance");
			
		}
		return balance;
	}

}
