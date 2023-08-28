package com.amazon.ecomm.dao;

import java.util.Hashtable;

import com.amazon.ecomm.models.Customer;
import com.amazon.ecomm.models.Invoice;

public interface CustomerDao {

	boolean addInvoices(Hashtable<Invoice,Customer> invoices);
	Hashtable<Invoice,Customer> getAllInvoices();
}
