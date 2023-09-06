package com.continental.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import org.omg.Messaging.SyncScopeHelper;

import com.continental.business.CustomerManager;
import com.continental.business.Utility;
import com.continental.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Stream API
		//chain of operations 
		Arrays.stream(Object.class.getMethods())
		.map(method -> method.getName())
		.distinct()
		.forEach(System.out::println);
		
		
		
		
		Stream<Integer> stream =Stream.of(1,3,5,6,78,9);
		
		stream.forEach(System.out::println);
		
		//Stream with Array
		//String[] stringArray=new String[]{"India","Srilanka","Singapore","Malasyia"};
		Stream<String> streamArray=Stream.of(new String[]{"India","Srilanka","Singapore","Malasyia"});
		//sorting
		 streamArray.sorted().forEach(System.out::println);
		
		
		
		
		
		//intstream
		IntStream.range(1, 5).map(i -> i * i).forEach(System.out::println);
		
		
		
		//infinite stream
		//IntStream.iterate(0, i -> i + 2).forEach(System.out::println);
		//peek is a non-interfering Stream operation. 
		//Non-interfering methods are those which guarantee 
		//that they will not modify the Stream’s data source during their execution.
		
		Stream.iterate(1, (Integer n) -> n + 1)
	      .peek(n -> System.out.println("number generated: - " + n))
	      .filter(n -> (n % 2 == 0))
	      .peek(n -> System.out.println("Even number filter passed for - " + n))
	      .limit(10)
	      .count();
		
		
		//Stream with List
		
		List<Integer> data=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++)
		   data.add(new Random().nextInt());
		
		Stream<Integer> streamList = data.stream();
		
		streamList.filter(x->x%2==0).forEach(System.out::println);
		
		//Reducer
		
		Integer[] array={35,67,90,23,78};
		//method1
		Arrays.stream(array).reduce((x,y)->x+y).ifPresent(s->System.out.println(s));
		//method2
		Arrays.stream(array).reduce(Integer::sum).ifPresent(s->System.out.println(s));
		//method3
		Arrays.stream(array).reduce(Utility::sum).ifPresent(s->System.out.println(s));
		
		String[] names={"Swarna","James","Suman","Daisy"};
		//method1
		Arrays.stream(names).reduce((x,y)->x+"-->"+y).ifPresent(s->System.out.println(s));
		//method2
		Arrays.stream(names).reduce(Utility::joinString).ifPresent(s->System.out.println(s));
		
		//Reducer with inital value
		
		int initialBalance=5000;
		Integer[] chequeAmount={436,4,234,54};
		
		System.out.println(Arrays.stream(chequeAmount).reduce(initialBalance,(x,y)->x+y));
		
		
		//identity with reducer
		
		Integer[] salary = {7,10,12,25};
		//identity, bifunction, accumulator
		//System.out.println("reducer with identity");
		//System.out.println(Arrays.stream(salary).reduce(3,(x,y)->x*y,(r,s)->r+s));
		List<Integer> salaryList = Arrays.asList(salary);
		
		System.out.println(salaryList.parallelStream().reduce(3,(x,y)->x*y,(r,s)->r+s));
		
		String[] countryNames={"Singapore","India","Australia"};
		//parallel stream
				ForkJoinPool commonPool = ForkJoinPool.commonPool();
				System.out.println("Parallel"+commonPool.getParallelism());    // 3

		List<String> countryList=Arrays.asList(countryNames);
		System.out.format("reducer: %s [%s]\n",
				countryList.parallelStream().reduce("-->",
						(x,y)->x+y),Thread.currentThread().getName());
		
		
		//filter
		//List<Integer> filteredList = streamList.filter(x->x%2==0).collect(Collectors.toList());
		
		//filteredList.forEach(x->System.out.println(x));
		
		//Streaming Customer Instance
		
	
		
		
		
		
		
		CustomerManager.addCustomer(new Customer(43542,"Shyam",new Date(117,1,1)));
		
		CustomerManager.addCustomer(new Customer(43452,"Zaheer",new Date(90,5,1)));
		CustomerManager.addCustomer(new Customer(2342,"Anitha",new Date(83,1,7)));
		CustomerManager.addCustomer(new Customer(2343,"Mukund",new Date(92,5,1)));
		
		Stream<Customer> customerStream = CustomerManager.getCustomerList().stream();
		customerStream.filter(customer->customer.getDob().before(new Date(110,1,1)))
		.sorted((x,y)->{
			
			return x.getName().compareTo(y.getName());
		})
		.map(s->s.getName().toUpperCase())
		.forEach(name->System.out.println(name));
		
		
		//parallel stream
		//ForkJoinPool commonPool = ForkJoinPool.commonPool();
		//System.out.println("Parallel"+commonPool.getParallelism());    // 3

		//-Djava.util.concurrent.ForkJoinPool.common.parallelism=5
		CustomerManager.getCustomerList()
		.parallelStream()
		
		.filter(s -> {
		    System.out.format("filter: %s [%s]\n",
		        s.getName().length()>2, Thread.currentThread().getName());
		    return true;
		})
		.sorted((x,y)->{
			
			return x.getName().compareTo(y.getName());
		})
		.forEachOrdered(s -> System.out.format("forEach: %s [%s]\n",
			    s.getName(), Thread.currentThread().getName()));
		
		
		/*
		.filter(s -> {
		    System.out.format("filter: %s [%s]\n",
		        s, Thread.currentThread().getName());
		    return true;
		});
		
		.map(s -> {
		    System.out.format("map: %s [%s]\n",
		        s, Thread.currentThread().getName());
		    return s.toUpperCase();
		})
		.forEach(s -> System.out.format("forEach: %s [%s]\n",
		    s, Thread.currentThread().getName()));
          */
		//Optional
		
		List<String> lnames = Arrays.asList(
				 "Bob", "Ram", "Jeff", "Jennifer");
				 Optional<String> firstS = lnames.stream()
				 .filter(name -> name.startsWith("S"))
				 .findFirst();
				 System.out.println(firstS.orElse("None found"));
				 
			
				 
				 List<Customer> customerlist =  CustomerManager.getCustomerList();
				 Optional<Customer> customer = customerlist.stream()
				 .filter(p -> p.getName().startsWith("A")).findAny();	
				 
				 
				 System.out.println(customer);	
		
		//List<Object> customerList=customerlist.stream()
			//			.filter(p -> p.getName().startsWith("A")).collect(Collectors.toList());
				
	  		
				
				// System.out.println(customerList);	
	}

}
