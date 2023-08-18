package com.hsbc.tax.utilities;

import java.util.Scanner;

import com.hsbc.tax.models.Gender;
import com.hsbc.tax.models.Person;

public class IncomeTaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //scanner to read
	 Scanner scanner=new Scanner(System.in);
		
	//create person object
		Person person=new Person();		
	//assign values
		System.out.println("Enter Pan Card No");
		person.setPanCardNo(scanner.nextLine());
		System.out.println("Enter Income");
		person.setIncome(scanner.nextLong());
		scanner.nextLine();
		System.out.println("Enter Gender");
		String gender=scanner.nextLine();
		person.setGender(Gender.valueOf(gender));
		System.out.println(person);		
		
		if((person.getIncome()>=0)&&(person.getGender()==Gender.FEMALE))
			System.out.println("Tax="+womenTaxCalculator(person));
		
		
	}
	
	
	/*
	 * private Long generalTaxCalculator(Person person) {
	 * 
	 * }
	 */
	
	private static Long womenTaxCalculator(Person person) {
		
		long tax=0;
		if((person.getIncome()>=0)&&(person.getIncome()<=190000))
			tax=tax;
		else if((person.getIncome()>=190001)&&(person.getIncome()<500000))
			tax+=person.getIncome()*0.10;
		else if((person.getIncome()>=500001)&&(person.getIncome()<800000))
				tax+=person.getIncome()*0.20;
		else
			tax+=person.getIncome()*0.30;
		
		
		return tax;	
		
		
	}
	
	

}
