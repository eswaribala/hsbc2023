package com.amazon.ecomm.views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import com.amazon.ecomm.dao.InvoiceSorter;
import com.amazon.ecomm.models.Invoice;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Invoice> data=new PriorityQueue<Invoice>
		(new InvoiceSorter());
		for(int i=0;i<100;i++) {
			data.offer(new Invoice(new Random().nextInt(10000),
					LocalDate.of(2020+new Random().nextInt(3),
							1+new Random().nextInt(10),
							1+new Random().nextInt(25)),
					new Random().nextInt(99999)));
		}
		Invoice invoice=null;
		
		while(!data.isEmpty()) {
		    invoice=data.poll();
			System.out.println(invoice.getInvoiceNo()+","+invoice.getAmount());
		}
		
	}
	
}
