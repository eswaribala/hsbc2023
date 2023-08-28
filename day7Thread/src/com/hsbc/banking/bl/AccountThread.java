package com.hsbc.banking.bl;

import com.hsbc.banking.models.Account;

public class AccountThread implements Runnable{
    
	private Account account; 	
	private int amount;	
	public AccountThread(Account account,String threadName,int amount) {
		super();
		// TODO Auto-generated constructor stub
		this.account=account;
		this.amount=amount;
		new Thread(this,threadName).start();
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub	
		//synchronized(this.account) {
		System.out.println("Balance="+this.account.
				withdraw(amount));
		//}
	}
	

}
