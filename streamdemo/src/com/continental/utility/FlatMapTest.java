package com.continental.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Object> evens = Arrays.asList(2, 4, 6);
		List<Object> odds = Arrays.asList(3, 5, 7); 
		List<Object> primes = Arrays.asList(2, 3, 5, 7, 11);
		List<Object> numbers = Stream.of(evens, odds, primes) 
				.flatMap(list -> list.stream()) 
				.collect(Collectors.toList());
		System.out.println("flattend list: " + numbers); 
		
		
		  List<Developer> team = new ArrayList<>();
	        Developer polyglot = new Developer("esoteric");
	        polyglot.add("clojure");
	        polyglot.add("scala");
	        polyglot.add("groovy");
	        polyglot.add("go");

	        Developer busy = new Developer("pragmatic");
	        busy.add("java");
	        busy.add("javascript");

	        team.add(polyglot);
	        team.add(busy);
	        
	        
	        

	        List<String> teamLanguages = team.stream().
	                map(d -> d.getLanguages()).
	                flatMap(l -> l.stream()).
	                collect(Collectors.toList());
	        System.out.println(teamLanguages);
	       // System.out.println(teamLanguages.
	        //containsAll(polyglot.getLanguages()));
	       // System.out.println(teamLanguages.
	        //containsAll(busy.getLanguages()));
	}

}
