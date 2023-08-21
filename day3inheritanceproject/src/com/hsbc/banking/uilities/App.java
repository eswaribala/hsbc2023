package com.hsbc.banking.uilities;

import com.hsbc.banking.models.Corporate;
import com.hsbc.banking.models.Customer;
import com.hsbc.banking.models.Individual;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individual individual=new Individual();
		
		individual.type="High Volume Transaction";
		Customer customer=individual;
		customer.type="Regular";
		System.out.println(customer.type);
		System.out.println(individual.type);
		
		
		
        //create individual instance
		//runtime polymorphism
		/*
		 * Customer[] customers=new Customer[5]; for(int i=0;i<customers.length;i++) {
		 * if(i<3) { customers[i]=new Individual();
		 * 
		 * } else customers[i]=new Corporate();
		 * 
		 * customers[i].setPassword("Test@123"); }
		 * 
		 * System.out.println(customers[0].equals(customers[1]));
		 * 
		 * 
		 * //count individuals and corporates int individualCount=0, corporateCount=0;
		 * for(Customer customer : customers) { if(customer instanceof Individual) {
		 * individualCount++; } if(customer instanceof Corporate) { corporateCount++; }
		 * 
		 * }
		 * 
		 * System.out.println("Individual Count="+individualCount);
		 * System.out.println("Corporate Count="+corporateCount);
		 */
	}

}
