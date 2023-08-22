package com.hsbc.banking.uilities;

public class QuizApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a=new String("a");
		String  b=new String("b");
		String c=new String("c");
		String d=new String("d");
		d=c=b=a;
		System.out.println(a+","+b+","+c+","+d);
        d=null;
        System.out.println(a+","+b+","+c+","+d);
	}

}
