package com.hsbc.banking.uilities;

import java.time.LocalDate;

import com.hsbc.banking.models.Account;
import com.hsbc.banking.models.CurrentAccount;
import com.hsbc.banking.models.SavingsAccount;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Account account=new Account();
		
		SavingsAccount savingsAccount=new 
				SavingsAccount(LocalDate.now(), 50000);
		
		System.out.println(savingsAccount.getAccountNo());
		CurrentAccount currentAccount=new 
				CurrentAccount(LocalDate.now(), 50000);
		
		System.out.println(currentAccount.getAccountNo());
	}

}
