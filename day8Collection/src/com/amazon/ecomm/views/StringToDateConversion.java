package com.amazon.ecomm.views;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.amazon.ecomm.models.Invoice;

public class StringToDateConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Invoice invoice =new Invoice();        
        
        SimpleDateFormat sf=new SimpleDateFormat("dd.MMM.yyyy");
        System.out.println("Enter Expiry Date dd.MMM.yyyy");
        String expDate=null;
        Date dateObj=null;
        try(Scanner scanner=new Scanner(System.in);) {
           expDate=scanner.nextLine();    
           dateObj=sf.parse(expDate);
			invoice.setExpDate(dateObj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(invoice.getExpDate());
        
        
		
	}
	

}
