package com.hsbc.banking.views;

import com.hsbc.banking.bl.Clock;
import com.hsbc.banking.bl.SimpleThread;
import com.hsbc.banking.models.Customer;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		SimpleThread simpleThread = new 
				SimpleThread("Parameswari");
		simpleThread.start();
		simpleThread.join();
		
		//runnable
		Customer customer=new Customer("A23423","param");
		Thread thread=new Thread(customer);
		thread.start();
		thread.join();
		
		Clock clock=new Clock();
		clock.start();
		clock.join();
		
		System.out.println(Thread.currentThread().getName());
	}

}
