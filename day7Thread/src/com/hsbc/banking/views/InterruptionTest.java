package com.hsbc.banking.views;

import java.util.Scanner;

import com.hsbc.banking.bl.SimpleThread;

public class InterruptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SimpleThread simpleThread=new SimpleThread("Parameswari");
    Scanner scanner=new Scanner(System.in);
    simpleThread.start();
    System.out.println("Enter your choice(Y/N");
    String input=scanner.nextLine();
    if(input.equalsIgnoreCase("N"))
    	simpleThread.interrupt();    
    scanner.close();
	}

}
