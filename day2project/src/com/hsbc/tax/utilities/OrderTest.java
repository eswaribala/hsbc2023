package com.hsbc.tax.utilities;

public class OrderTest {

	static {
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside Instance Block");
		
	}
	
	public OrderTest() {
		System.out.println("Inside constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new OrderTest();
		System.out.println("In String main");
		
		for(String arg : args)
			System.out.println(arg);
		//exact match
		main(50);
		main();
		main(89,78,90);
		main(67,89);
		long[] data=new long[]{3,4,5,6,7};
		main(data);
		
	}
	public static void main(long[] args) {
		// TODO Auto-generated method stub
        new OrderTest();
		System.out.println("In long main");
		System.out.println(args.length);
		for(long arg : args)
			System.out.println(arg);
	}
	
	public static void main(int... args) {
		// TODO Auto-generated method stub
        new OrderTest();
        
		System.out.println("In varargs main");
		for(int arg : args)
			System.out.println(arg);
	}
}
