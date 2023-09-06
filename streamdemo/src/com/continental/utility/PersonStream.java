package com.continental.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.continental.model.Person;

public class PersonStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				List<String> items = new ArrayList<String>();

				items.add("Apple");
				items.add("Grapes");
				items.add("PineApple");
				items.add("Anar");
				items.add("Guava");
		     
				double[] irates=new double[100];
				Random rand=new Random(3000);
				for(int i=0;i<100;i++)
				{
					irates[i]=rand.nextDouble()*1000;
				}
				
				Stream<String> stream = items.stream();
				Stream<Integer> instream = Stream.of(67,78,78,145,90);
				DoubleStream arrstream = Arrays.stream(irates);
				
				
				stream.filter( item -> item.startsWith("G") ).forEach(item -> System.out.println(item + " "));

				instream.filter( item -> item>70 ).forEach(item -> System.out.println(item + " "));
				
				arrstream.filter( item -> item<3000 ).forEach(item -> System.out.println(item + " "));
				
				
				items.stream()
			     .map( item -> item.toUpperCase() ).forEach(item -> System.out.print(item + " "));
				
				List<String> filtered = items.stream()
					    .filter( item -> item.startsWith("A") )
					    .collect(Collectors.toList());
				
				filtered.stream().forEach(item -> System.out.print(item + " "));
				
				 String shortest = items.stream()
					        .min(Comparator.comparing(item -> item.length()))
					        .get();
				 System.out.println(shortest);
				 long count = items.stream()
					     .filter( item -> item.startsWith("A"))
					     .count();
				 Optional<String> reduced2 = items.stream()
						 .reduce((acc, item) -> acc + " ->" + item);
					      
				 System.out.println("Reduced2..."+reduced2);
				 String reduced = items.stream()
						    .filter( item -> item.startsWith("o"))
						    .reduce("", (acc, item) -> acc + " " + item);
				 System.out.println("Reduced3..."+reduced);
				 
				 
				 List<String> names = Arrays.asList(
						 "Bob", "Tom", "Jeff", "Jennifer");
						 Optional<String> firstS = names.stream()
						 .filter(name -> name.startsWith("S"))
						 .findFirst();
						 System.out.println(firstS.orElse("None found"));
						 
						 List<Person> personlist =  new Person().getPersons();
								 Optional<Person> person = personlist.stream()
								 .filter(p -> p.getFirstName().startsWith("D")).findAny();
								
								 
								 
								 System.out.println(person);			 
								 
								 List<Integer> numbers =
										 Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
										 long sum =numbers.stream() .mapToInt(value->value*value).sum();
										 System.out.println(sum);


			}
	}


