package com.continental.utility;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.continental.model.Employee;
import com.continental.model.Person;

public class TestFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //filtering	     	     
		     List<Employee> result = Employee.getEmployees().stream()                
	                .filter(p->(LocalDate.now().getYear()-p.getDoj().getYear())>5)    
	                .collect(Collectors.toList());   
	     
	     System.out.println(result);
	//sorting and filtering
	     
	     java.util.Optional<Employee> employee = Employee.getEmployees()
	    	        .stream()
	    	        .sorted((e1, e2) -> e1.getDoj()
	    	                .compareTo(e2.getDoj())).findFirst();

	    	System.out.println(employee.get());
	    	
	  //sorting all employees by experience
	    	 List<Employee> employeeList = Employee.getEmployees()
		    	        .stream()
		    	        .sorted((e1, e2) -> e1.getDoj()
		    	                .compareTo(e2.getDoj())) .collect(Collectors.toList());   

	    	 employeeList.forEach(e -> System.out.println("First Name:"+ e.getFirstName()+", Last Name: "
	    	 +e.getLastName()+", DOJ:"+e.getDoj().toString()));
	    	
	    	
	  
	}

}
