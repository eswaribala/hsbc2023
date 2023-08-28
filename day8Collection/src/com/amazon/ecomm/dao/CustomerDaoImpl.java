package com.amazon.ecomm.dao;

import java.util.Hashtable;

import com.amazon.ecomm.models.Customer;
import com.amazon.ecomm.models.Invoice;

public class CustomerDaoImpl implements CustomerDao {

	private Hashtable<Invoice,Customer> invoices;
	
	public CustomerDaoImpl() {
		invoices=new Hashtable<Invoice,Customer>();
	}
	@Override
	public boolean addInvoices(Hashtable<Invoice, Customer> invoices) {
		// TODO Auto-generated method stub
		 this.invoices.putAll(invoices);
		return true;
	}

	@Override
	public Hashtable<Invoice, Customer> getAllInvoices() {
		// TODO Auto-generated method stub
		return this.invoices;
	}

}
