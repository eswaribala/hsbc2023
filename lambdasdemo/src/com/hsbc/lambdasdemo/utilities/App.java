package com.hsbc.lambdasdemo.utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.hsbc.lambdasdemo.models.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //define lambda expression
	 //it is overriding run method	
	 Runnable runnable=()->{
		 System.out.println("Invoking run method");	 
		 };
	//invoke lambda expression
	 new Thread(runnable).start();
	 
	 //define lambda for comparator
	 Comparator<Employee> comparator=(e1,e2)->{
		 return e1.getDoj().compareTo(e2.getDoj());
	 };	 
	 //invoke the lambda
	 //sort the employees
	 List<Employee> employees=getEmployees();	 
	 employees.sort(comparator);	 
	 //print the employees
	 for(Employee employee:employees)
		 System.out.println(employee.getEmployeeNo()+","
	 +employee.getDoj());
	 
	 
	 
		
	}
	
	public static List<Employee> getEmployees(){
		
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
	

}
