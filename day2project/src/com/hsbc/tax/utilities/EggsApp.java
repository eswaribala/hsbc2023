package com.hsbc.tax.utilities;

import java.util.Scanner;

public class EggsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to read
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of eggs");
		int n=scanner.nextInt();
		scanner.nextLine();
		int gross,dozen,eggs=0;			
		gross=n/144;
		n=n%144;
		dozen=n/12;
		n=n%12;
		eggs=n;
		
		System.out.println("Gross="+gross+",Dozen="+dozen+",Eggs="+eggs);
	}

}
