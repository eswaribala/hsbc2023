package com.hsbc.ecommerceapi.services;

import java.util.List;

import com.hsbc.ecommerceapi.models.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	List<Customer> getCustomers();
	Customer getCustomerById(long customerId);
	Customer updateCustomer(long customerId, long contactNo);
	boolean deleteCustomer(long customerId);
}
