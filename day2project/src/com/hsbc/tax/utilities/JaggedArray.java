package com.hsbc.tax.utilities;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to read
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Row Size");
		int row=scanner.nextInt();
		scanner.nextLine();
		//declare jagged array
		int premium[][]=new int[row][];
		int col=0;
		
		//read premium
		for(int i=0;i<premium.length;i++) {
			System.out.println("Enter col Size");
			col=scanner.nextInt();
			scanner.nextLine();
			premium[i]=new int[col];
		
			for(int j=0;j<premium[i].length;j++) {
				System.out.println("Enter the amount"+j);
				
				premium[i][j]=scanner.nextInt();
				scanner.nextLine();
			}
			
			
		}
		
		
		//print the values
		
		for(int i=0;i<premium.length;i++) {
			
		
			for(int j=0;j<premium[i].length;j++) {
				System.out.print(premium[i][j]+"\t");
				
			}
			System.out.println("\n");
			
		}
		
		
		
		
	}

}
