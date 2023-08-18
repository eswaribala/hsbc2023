package com.hsbc.tax.utilities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;

import com.hsbc.tax.models.Employee;

public class ServiceExcellenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //create array 
    Employee[] employees=new Employee[100];
    int exp=0;
    for(int i=0;i<employees.length;i++) {
    	//create employee instance
    	employees[i]=new Employee();
    	employees[i].setEmployeeNo(new Random().nextInt(100000));
    	employees[i].setName("employee"+i);
    	employees[i].setDoj(LocalDate.of(1998+new Random().nextInt(20), 
    			1+new Random().nextInt(10),1+new Random().nextInt(25)));
    	exp=Period.between(employees[i].getDoj(),LocalDate.now()).getYears();
        employees[i].setExperience(exp);
    
    }
    
    //show employee data unsorted....
    System.out.println("Before Sorting.....");
    for(Employee emp : employees)
    	System.out.println(emp);
    
    //show sorted employee data (experience)
    
    Arrays.sort(employees);
    System.out.println("After Sorting.....");
    for(Employee emp : employees)
    	System.out.println(emp);
    
	//10 years of excellence
    System.out.println("10 Years of Excellence....");
    for(Employee emp : employees) {
     if(emp.getExperience()>=10)
    	System.out.println(emp);
    
    }
		
  //5 years of excellence
    System.out.println("5 Years of Excellence....");
    for(Employee emp : employees) {
     if((emp.getExperience()>=5)&&(emp.getExperience()<10))
    	System.out.println(emp);
    
    }
    
	}

}
