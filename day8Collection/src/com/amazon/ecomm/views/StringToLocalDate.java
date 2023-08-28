package com.amazon.ecomm.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.amazon.ecomm.models.Invoice;

public class StringToLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Invoice invoice =new Invoice();        
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.
        		ofPattern("yyyy-MM-dd");        
        System.out.println("Enter Expiry Date yyyy-MM-dd");
        String date=null;
        
        try(Scanner scanner=new Scanner(System.in);) {
           date=scanner.nextLine();    
           invoice.setDate(LocalDate.parse(date,dateTimeFormatter));
			
		}
        System.out.println(invoice.getDate());
	}

}
