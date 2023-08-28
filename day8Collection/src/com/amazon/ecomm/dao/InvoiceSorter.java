package com.amazon.ecomm.dao;

import java.util.Comparator;

import com.amazon.ecomm.models.Invoice;

public class InvoiceSorter implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
		// TODO Auto-generated method stub
		if(o1.getInvoiceNo()>o2.getInvoiceNo())
			return 1;
		else if(o1.getInvoiceNo()<o2.getInvoiceNo())
			return -1;
		else
			return 0;
	}

}
