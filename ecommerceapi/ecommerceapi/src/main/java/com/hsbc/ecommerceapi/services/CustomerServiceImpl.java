package com.hsbc.ecommerceapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.ecommerceapi.models.Customer;
import com.hsbc.ecommerceapi.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		//it will generate insert query
		return this.customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		//select all
		return this.customerRepository.findAll();
	}
	
	
	

	@Override
	public Customer updateCustomer(long customerId, long contactNo) {
		// TODO Auto-generated method stub
		Customer customer=getCustomerById(customerId);
		customer.setContactNo(contactNo);		
		return this.customerRepository.save(customer);
	}

	@Override
	public boolean deleteCustomer(long customerId) {
		// TODO Auto-generated method stub
		boolean status=false;
		if(getCustomerById(customerId)!=null)
		{
			this.customerRepository.deleteById(customerId);
		    status=true;
		}
		return status;
	}

	@Override
	public Customer getCustomerById(long customerId) {
		// TODO Auto-generated method stub
		return this.customerRepository.findById(customerId).orElse(null);
	}

}
