package com.hsbc.banking.views;

import java.io.IOException;
import java.io.StringReader;

public class TestChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String s="HSBC Technologies;"; 
		StringReader b=new StringReader(s); 
		int i=0;
		while((i=b.read())!=-1) { 
	    System.out.println((char)i);
	    i=b.read();
	    System.out.println((char)i);	    
		b.mark(2);  		
		i=b.read();
		System.out.println("mark invoked. now printing characters after mark.");  
		System.out.println((char)i);
		b.reset();
		}
		b.close();      
		     
	}

}
