package com.hsbc.ecommerceapi.repositories;

import java.util.List;

import com.hsbc.ecommerceapi.models.Customer;

public interface CustomerRepository {

	int addCustomer(Customer customer);
	List<Customer> getCustomers();
	Customer updateCustomer(long customerId, long contactNo);
	boolean deleteCustomer(long customerId);
}
