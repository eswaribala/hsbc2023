package com.amazon.ecomm.views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;

import com.amazon.ecomm.dao.InvoiceSorter;
import com.amazon.ecomm.models.Invoice;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Invoice> data=new TreeSet<Invoice>
		(new InvoiceSorter());
		for(int i=0;i<100;i++) {
			data.add(new Invoice(new Random().nextInt(10000),
					LocalDate.of(2020+new Random().nextInt(3),
							1+new Random().nextInt(10),
							1+new Random().nextInt(25)),
					new Random().nextInt(99999)));
		}
		Invoice invoice=null;
		
		Iterator<Invoice> itr=data.iterator();
		while(itr.hasNext()) {
			invoice=itr.next();
			System.out.println(invoice.getInvoiceNo()
					+","+invoice.getAmount());
		}
		
	}
	
}
