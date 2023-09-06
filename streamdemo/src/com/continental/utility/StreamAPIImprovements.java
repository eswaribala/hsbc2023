package com.continental.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class StreamAPIImprovements {
	
	private static boolean isEven(long number) {
		return number%2==0;
	}

	/*
	 * private static List<Customer> createCustomers(){ List<Customer>
	 * customerList=new ArrayList<Customer>();
	 * 
	 * for(int i=0;i<100;i++) { customerList.add(new Customer(new
	 * Random().nextInt(10000), "Customer"+i, LocalDate.of(1900+new
	 * Random().nextInt(120), 1+new Random().nextInt(10) , 1+new
	 * Random().nextInt(27)))); }
	 * 
	 * return customerList; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Stream.of(20,30,40,62,85,21).sorted()  
	                .dropWhile(i -> (i<85)).collect(Collectors.toList());
	        System.out.println(list); // collecting into a list
	        list = Stream.of(20,30,40,62,85,21).sorted()  
	                .takeWhile(i -> (i<85)).collect(Collectors.toList());
	        System.out.println(list); // collecting into a list   
	        
	        Stream.iterate("*", s -> s + "*")
	        .takeWhile(s -> s.length() < 7)
	        .forEach(System.out::println);    
	        
	        
	//check it with object
	      //filter removes element from stream
			//takewhile or dropwhile if first occurrence fails abort the stream  	
		/*
		 * List<Customer> customers=
		 * createCustomers().stream().sorted((c1,c2)->c1.getDob().compareTo(c2.getDob())
		 * ) .dropWhile(c->c.getCustomerId()<500).collect(Collectors.toList());
		 * 
		 * for(Customer customer:customers) { System.out.println(customer); }
		 */
	 
	 System.out.println("Predicate Not.....");
	 //predicate not
		/*
		 * createCustomers().stream().map(c->c.getCustomerId()) .filter(Predicate.not(
		 * StreamAPIImprovements::isEven)) .forEach(c->System.out.println(c));
		 */
	 Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
	 Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
	 if(firstNameWithD.isPresent()){
	 	System.out.println("First Name starting with D="+firstNameWithD.get()); //David
	 	
	 }	   
	 
	 
	
	}

}
