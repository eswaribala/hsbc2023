package com.hsbc.ecommerceappv1.repositories;

import java.util.List;

import com.hsbc.ecommerceappv1.models.Customer;

public interface CustomerRepository {

	int addCustomer(Customer customer);
	List<Customer> getCustomers();
	Customer updateCustomer(long customerId, long contactNo);
	boolean deleteCustomer(long customerId);
}
