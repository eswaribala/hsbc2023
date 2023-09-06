package com.continental.business;

import java.util.ArrayList;
import java.util.List;

import com.continental.model.Customer;

public class CustomerManager {

	private static List<Customer> customerList;
	
	static
	{
		customerList=new ArrayList<Customer>();
		
	}
	
	public static void addCustomer(Customer customer)
	{
		customerList.add(customer);
	}
	
	public static List<Customer> getCustomerList()
	{
		return customerList;
	}
	
}
