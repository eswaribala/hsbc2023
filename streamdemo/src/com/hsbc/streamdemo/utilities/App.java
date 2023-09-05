package com.hsbc.streamdemo.utilities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.hsbc.streamdemo.models.Employee;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //intermediate    
	//sort employees based on experience
	
		/*
		 * Comparator<Employee> comparator=(e1,e2)->{ return
		 * e1.getDoj().compareTo(e2.getDoj()); };
		 */
		getEmployees().stream()
		.sorted((e1,e2)->{ return
				 e1.getDoj().compareTo(e2.getDoj());})
		.map(e->e.getName()+","+e.getDoj())
		.forEach(System.out::println);
	
		
	}
	
private static List<Employee> getEmployees(){
		
		List<Employee> employees=new ArrayList<Employee>();
		for(int i=0;i<100;i++) {
			employees.add(new Employee(new Random().nextInt(10000),
					"employeee"+i,LocalDate.
					of(2000+new Random().nextInt(22),
						1+new Random().nextInt(10), 
						1+new Random().nextInt(25))));
		}
		
		return employees;
	}

   private void test() {
	 //Stream 
	 		//show only employee names
	 		getEmployees().stream()
	 		.map(e->e.getName())
	 		.forEach(System.out::println);
	 		
	 		//show employee names having experience more than 5 years
	 	long result=getEmployees().stream()
	 		.filter(e->Period.between(e.getDoj(),LocalDate.now())
	 				.getYears()>5)
	 		.map(e->e.getName())
	 		.count();
	 	
	 	System.out.println(result);
	 		//print distinct employee names 
	 	getEmployees().stream()
	 	.filter(e->Period.between(e.getDoj(),LocalDate.now())
	 			.getYears()>5)
	 	.map(e->e.getName())
	 	.distinct()
	 	.forEach(System.out::println);
	 	
	 	List<String> filteredNames=getEmployees().stream()
	 		 	.filter(e->Period.between(e.getDoj(),LocalDate.now())
	 		 			.getYears()>5)
	 		 	.map(e->e.getName()).collect(Collectors.toList());
	 		
	 		filteredNames.stream().distinct()
	 		.forEach(System.out::println);
	 		
   }

}
