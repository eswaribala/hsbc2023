package com.hsbc.banking.views;

import com.hsbc.banking.bl.AccountThread;
import com.hsbc.banking.models.Account;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account account=new Account(10000);
       //multiple threads
       new AccountThread(account,"Customer-1",7000);
       new AccountThread(account,"Customer-2",5000);
		
		
	}

}
