package com.hsbc.banking.utilities;

import java.util.Random;

import com.hsbc.banking.bl.CustomerBL;
import com.hsbc.banking.bl.CustomerBLImpl;
import com.hsbc.banking.exceptions.CustomerException;
import com.hsbc.banking.exceptions.NoSpaceFoundException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.Customer;

public class App {
	
	public static void main(String... names) throws Exception{
		
		CustomerBL customerBL=new CustomerBLImpl(5);
		Customer customer=new Customer();
		customer.setCustomerId(new Random().nextInt(10000));
		customer.setName("Par");
		try {
		  customerBL.addCustomer(customer);
		}
		catch(CustomerException exception) {
			System.out.println(exception.getMessage());
			StackTraceElement[] stacks=exception.getStackTrace();
			for(StackTraceElement stack : stacks) {
				System.out.println(stack.getClassName());
				System.out.println(stack.getFileName());
				System.out.println(stack.getMethodName());
				System.out.println(stack.getLineNumber());
			}
		}
        
				
	}
	
	/*
	 * // TODO Auto-generated method stub	
		try {			
		int[] numbers=new int[names.length-1];
			try {
			int data=10;
			int result=data/names.length;
			System.out.println(names[2]);
			}
			catch(ArithmeticException|ArrayIndexOutOfBoundsException exception) {
				System.out.println(exception.getMessage());
				StackTraceElement[] stacks=exception.getStackTrace();
				for(StackTraceElement stack : stacks) {
					System.out.println(stack.getClassName());
					System.out.println(stack.getFileName());
					System.out.println(stack.getMethodName());
					System.out.println(stack.getLineNumber());
				}
				
			}
		}
		catch(NegativeArraySizeException negativeArraySizeException) {
			System.out.println(negativeArraySizeException.getMessage());
			StackTraceElement[] stacks=negativeArraySizeException.getStackTrace();
			for(StackTraceElement stack : stacks) {
				System.out.println(stack.getClassName());
				System.out.println(stack.getFileName());
				System.out.println(stack.getMethodName());
				System.out.println(stack.getLineNumber());
			}
		}
	 */
	
}
