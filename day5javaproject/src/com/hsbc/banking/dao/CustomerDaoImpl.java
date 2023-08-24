package com.hsbc.banking.dao;

import com.hsbc.banking.models.Customer;

public class CustomerDaoImpl implements CustomerDao{

	private Customer[] customers;	
	private boolean status;
	public CustomerDaoImpl(int size) {
		super();
		this.customers=new Customer[size];
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
		customers[0]=customer;
		status=true;
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
		  throw arrayIndexOutOfBoundsException;
		}
		return status;
	}

}
