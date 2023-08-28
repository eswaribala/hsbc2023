package com.amazon.ecomm.views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import com.amazon.ecomm.dao.InvoiceDao;
import com.amazon.ecomm.dao.InvoiceDaoImpl;
import com.amazon.ecomm.models.Invoice;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //instantiate dao layer
		InvoiceDao invoiceDao=new InvoiceDaoImpl();
		invoiceDao.addInvoices(generateInvoices());		
		List<Invoice> invoices=invoiceDao.getAllInvoices();
		ListIterator<Invoice> itr=invoices.listIterator();
		System.out.println(invoices.size());		Invoice invoice=null;
		while(itr.hasNext())
		{
			invoice=itr.next();
			System.out.println(invoice.getInvoiceNo()+","
			+invoice.getDate().toString()+","+invoice.getAmount());
			//concurrent modification
			itr.add(new Invoice(new Random().nextInt(10000),
					LocalDate.of(2020+new Random().nextInt(3),
							1+new Random().nextInt(10),
							1+new Random().nextInt(25)),
					new Random().nextInt(99999)));
			
		}
		
		System.out.println(invoices.size());
		
	}
	
	private static List<Invoice> generateInvoices(){
		List<Invoice> invoices=new ArrayList<Invoice>();
		for(int i=0;i<2;i++) {
			invoices.add(new Invoice(new Random().nextInt(10000),
					LocalDate.of(2020+new Random().nextInt(3),
							1+new Random().nextInt(10),
							1+new Random().nextInt(25)),
					new Random().nextInt(99999)));
		}
		return invoices;
	}

}
