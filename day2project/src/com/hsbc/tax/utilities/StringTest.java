package com.hsbc.tax.utilities;

import java.util.stream.Stream;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //calculates the length
		System.out.println(" ".isEmpty());
		//checks the space
		System.out.println(" ".isBlank());
		
		String data="First Name=\nLastName=\n";
		//System.out.println(data);
	   // Stream<String> lines=  data.lines();
	    for(Object obj : data.lines().toArray())
	    	System.out.println(obj);
	    
	    data="    HSBC        ";
	    System.out.println(data.stripLeading().length());
	    System.out.println(data.stripTrailing().length());
	    System.out.println(data.strip().length());
	}

}
