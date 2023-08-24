package com.hsbc.banking.bl;

import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.Customer;

public interface CustomerBL {
	
	boolean addCustomer(Customer customer) throws Exception;

}
