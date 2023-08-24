package com.hsbc.banking.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hsbc.banking.dao.CustomerDao;
import com.hsbc.banking.dao.CustomerDaoImpl;
import com.hsbc.banking.exceptions.CustomerException;
import com.hsbc.banking.exceptions.NoSpaceFoundException;
import com.hsbc.banking.exceptions.UserNameException;
import com.hsbc.banking.models.Customer;

public class CustomerBLImpl implements CustomerBL{

	private CustomerDao customerDao;	
	
	public CustomerBLImpl(int size) {
		super();
		// TODO Auto-generated constructor stub
		this.customerDao=new CustomerDaoImpl(size);		
	}
	@Override
	public boolean addCustomer(Customer customer) throws Exception {
		String regex="[a-zA-Z]{5,25}";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(customer.getName());
		try {
		if(matcher.matches()) {
			try {
			return this.customerDao.addCustomer(customer);
			}
			catch(ArrayIndexOutOfBoundsException ArrayIndexOutofBoundException) {
				throw new NoSpaceFoundException("Not enough space");
			}
		}
		else
			throw new Exception("User name Should be 5 to 25 alphabets");
		}
		catch(NoSpaceFoundException|UserNameException exception) {
			
			throw new CustomerException(exception.getMessage());
		}
	}
}
