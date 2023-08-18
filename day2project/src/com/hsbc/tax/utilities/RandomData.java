package com.hsbc.tax.utilities;

import java.util.Random;
import java.util.Scanner;

public class RandomData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to read
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=scanner.nextInt();
		scanner.nextLine();
		//declare one dim array		
		int randData[]=new int[size];
		int genData=0;
		Random random=new Random();
		for(int i=0;i<randData.length;i++) {
			genData=random.nextInt(9999);
			if(genData<1000)
				genData=genData+1000;
			randData[i]=genData;
		}
		//print the array
		//enhanced for loop
		for(int value:randData) 
			System.out.print(value+"\t");
		
		
		
		
		
		
		
		
		
	}

}
