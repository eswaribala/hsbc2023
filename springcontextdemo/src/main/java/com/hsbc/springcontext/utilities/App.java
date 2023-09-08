package com.hsbc.springcontext.utilities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.banklib.models.Address;
import com.hsbc.springcontext.models.Account;
import com.hsbc.springcontext.models.Bank;
import com.hsbc.springcontext.models.Customer;
import com.hsbc.springcontext.models.InvoiceService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //step 1 create context
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/hsbc"
			+ "/springcontext/resources/applicationContext.xml");	
	//step 2 create account instance	
	Account account=(Account) ctx.getBean("savingsAccount");
	Bank bank = (Bank) ctx.getBean("bank");
	bank.setBankCode("HSBC0001");
	bank.setBankName("HSBC");	
	//set the values
	account.setAccountNo(475672);
	//account.setBank(bank);
	account.setRunningTotal(855565);
	
	//step3 retrieve details	
	System.out.println(account.getAccountNo()+","
	+account.getRunningTotal()
			+","+account.getBank().getBankCode()
	+account.getBank().getBankName());
	
	//create customer instance
	Customer customer=(Customer) ctx.getBean("customer");
	//Address address=(Address) ctx.getBean("address");
	 ApplicationContext applicationContext=new 
			 AnnotationConfigApplicationContext(Bank.class);		 
	 Address address=(Address) applicationContext.getBean("address");
	InvoiceService invoiceService=(InvoiceService)ctx.
			getBean("invoiceService");
	
	ctx.registerShutdownHook();
	
	}

}
