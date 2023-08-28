package com.amazon.ecomm.dao;

import java.util.LinkedList;
import java.util.List;

import com.amazon.ecomm.models.Invoice;

public interface InvoiceDao {
	boolean addInvoices(List<Invoice> invoices);

	LinkedList<Invoice> getAllInvoices();
}
