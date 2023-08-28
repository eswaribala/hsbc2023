package com.amazon.ecomm.dao;

import java.util.LinkedList;
import java.util.List;

import com.amazon.ecomm.models.Invoice;

public class InvoiceDaoImpl implements InvoiceDao{
	
	private LinkedList<Invoice> invoices;

	@Override
	public boolean addInvoices(List<Invoice> invoices) {
		// TODO Auto-generated method stub
		
		this.invoices=new LinkedList<Invoice>();
		for(Invoice invoice : invoices) {
			this.invoices.addLast(invoice);
		}
		
		
		return true;
	}

	@Override
	public LinkedList<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return this.invoices;
	}

}
