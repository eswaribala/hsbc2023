package com.amazon.ecomm.views;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.amazon.ecomm.dao.CustomerDao;
import com.amazon.ecomm.dao.CustomerDaoImpl;
import com.amazon.ecomm.models.Customer;
import com.amazon.ecomm.models.Invoice;

public class InvoiceMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerDao customerDao=new CustomerDaoImpl();
		customerDao.addInvoices(generateAllInvoices());
        Set<Map.Entry<Invoice,Customer>> set=
        		customerDao.getAllInvoices().entrySet();
        
        Iterator<Map.Entry<Invoice,Customer>> itr=set.iterator();
        Map.Entry<Invoice,Customer> data=null;
        while(itr.hasNext()) {
        	data=itr.next();
        	System.out.println(data.getKey().getInvoiceNo()+","+
        	data.getValue().getMobileNo());
        	
        }
        
        System.out.println("Enter Mobile No");
        long mobileNo=new Scanner(System.in).nextLong();
        itr=set.iterator();
        while(itr.hasNext()) {
        	data=itr.next();
        	if(data.getValue().getMobileNo()==mobileNo)
        	 System.out.println(data.getKey().getInvoiceNo()+","+
        	 data.getValue().getMobileNo());
        	
        }
		
		
		
	}
	
	private static Hashtable<Invoice,Customer> generateAllInvoices(){		
		Hashtable<Invoice,Customer> invoices=new 
				Hashtable<Invoice,Customer>();
		Customer customer=null;
		Invoice invoice=null;
		for(int i=0;i<100;i++) {
			customer=new Customer(98997890+new Random().nextInt(99),
					"customer"+i);			
			for(int j=0;j<1+new Random().nextInt(10);j++) {
				invoice=new Invoice(new Random().nextInt(10000),
						LocalDate.of(2020+new Random().nextInt(3),
								1+new Random().nextInt(10),
								1+new Random().nextInt(25)),
						new Random().nextInt(99999));
				invoices.put(invoice, customer);				
			}
		}
		return invoices;		
	}

}
