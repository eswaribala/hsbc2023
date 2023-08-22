package com.hsbc.banking.utilities;

import com.hsbc.banking.models.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1=new Customer("Parameswari","param@gmail.com");
		
		Customer customer2;
		try {
			customer2 = (Customer) customer1.clone();
			System.out.println(customer1.equals(customer2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
