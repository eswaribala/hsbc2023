package com.hsbc.tax.utilities;

import java.util.Scanner;

public class CurrencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to read
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter currency");
		int currency=scanner.nextInt();
		scanner.nextLine();
		int amount=0;
		while(currency>0) {
			amount=currency%10;
			System.out.print(amount+"\t");
			currency=currency/10;
		}
	}

}
