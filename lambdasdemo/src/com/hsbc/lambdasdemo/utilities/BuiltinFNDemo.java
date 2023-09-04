package com.hsbc.lambdasdemo.utilities;

import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import com.hsbc.lambdasdemo.facades.DataSupplier;

import com.hsbc.lambdasdemo.facades.OTPGenerator;
import com.hsbc.lambdasdemo.models.Employee;

public class BuiltinFNDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  //lambda fi
	  Function<List<Employee>, List<String>> fn=(employees)->{
          byte exp=0; 
          List<String> empNames=new ArrayList<String>();
		  for(Employee employee: employees)
		  {
			  exp=(byte) Period.between(employee.getDoj()
					  ,LocalDate.now()).getYears();
			  if(exp>5)
				  empNames.add(employee.getName());
		  }
		  return empNames;
		  
	  };	
	  //invoke the lambda	  
	  for(String name : fn.apply(App.getEmployees()))
	      System.out.println(name);   
	  
	  //predicate define lambda
	  String regex="[a-zA-Z]*";
	  Pattern pattern=Pattern.compile(regex);
	  Predicate<Employee> predicate=(employee)->{
		 if(pattern.matcher(employee.getName()).matches())
			  return true;
		  else
			  return false;		  
	  };	  
	  //invoke the predicate
	 System.out.println(predicate.test(new Employee(new Random()
			 .nextInt(10000),
					"Parameswari99",LocalDate.
					of(2000+new Random().nextInt(22),
						1+new Random().nextInt(10), 
						1+new Random().nextInt(25)))));
	  
	File file=new File("src/com/hsbc/lambdasdemo/models", 
			"Employee.java"); 
	Consumer<File> consumer=(f)->{
		if(f.exists())
			System.out.println("File Available...");
		else
			System.out.println("File Not Available...");
	};
	  
	consumer.accept(file);
	//Method reference
	Supplier<Integer> supplier=OTPGenerator::generateOTP;	
	System.out.println("OTP="+supplier.get());	
	//constructor reference	
	Supplier<Employee> employeeSupplier=Employee::new;
	System.out.println(employeeSupplier.get().getEmployeeNo()); 	
	//Method reference
	Consumer<String> dataConsumer=System.out::println;
	dataConsumer.accept("8458");
	//Method reference
	Consumer<String> intConsumer=Integer::parseInt;
	intConsumer.accept("8458");
	Employee empObject=new Employee(new Random()
			 .nextInt(10000),
				"Parameswari99",LocalDate.
				of(2000+new Random().nextInt(22),
					1+new Random().nextInt(10), 
					1+new Random().nextInt(25)));	

	//instance method reference
	DataSupplier<LocalDate> dateSupplier=empObject::getDoj;
	System.out.println(dateSupplier.getData());
	
	DataSupplier<String> nameSupplier=empObject::getName;
	System.out.println(nameSupplier.getData());
		
	}
	
	 
	
	

}
