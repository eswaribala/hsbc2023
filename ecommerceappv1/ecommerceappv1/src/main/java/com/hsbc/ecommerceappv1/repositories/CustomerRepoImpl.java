package com.hsbc.ecommerceappv1.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.ecommerceappv1.models.Customer;

@Repository
public class CustomerRepoImpl implements CustomerRepository {
    @Autowired
	private JdbcTemplate jdbcTemplate;
    @Value("${addcustomer}")
    private String query;    
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(query,new Object[] 
				{ customer.getFirstName(), 
				  customer.getLastName(), 
				  customer.getDob(),customer.getContactNo(),
				  customer.getAddress(),
				 customer.getEmail(),customer.getGender()});
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(long customerId, long contactNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(long customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
