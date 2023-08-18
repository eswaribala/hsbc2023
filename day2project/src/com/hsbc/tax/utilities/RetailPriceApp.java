package com.hsbc.tax.utilities;

import java.util.Scanner;

import com.hsbc.tax.models.Product;

public class RetailPriceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Scanner to read
		Scanner scanner=new Scanner(System.in);
		//create instance
		Product product=new Product();
		System.out.println("Enter Product No");
		product.setProductNo(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Enter Qty");
		product.setQty(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Product="+product);
		double price=0.0;
		switch(product.getProductNo()) {
		case 1: 
			   price=product.getQty()*22.50;
			   break;
		case 2:
			 price=product.getQty()*44.50;
			   break;
			   
		case 3:
			 price=product.getQty()*9.50;
			   break;	   
			   
		
		}
		
		System.out.println("Retail Price="+price);
		
	}

}
