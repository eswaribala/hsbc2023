package com.hsbc.banking.utilities;

class App {
	//instance variable
	static String name;

	public static void main(String...strings) {
		// TODO Auto-generated method stub

		System.out.println("Rocking with Java 11 ");
		
		//data type ranges
		
		byte age=127;
		
		char letter='\u0061';
		System.out.println("The character is"+letter);
		String messageValue="Hi";
		
		//literals
		
		int balance=0xFF;
		System.out.println("Balance="+balance);
		
		//local variable
		
		String name;
		
		System.out.println(App.name);
		
	}

}
