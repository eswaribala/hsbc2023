package com.hsbc.java9to11demo.utilities;

import java.util.Random;

import com.hsbc.java9to11demo.dtos.ResponseWrapper;
import com.hsbc.java9to11demo.models.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable type inference
		var randomData=genData();		
		var data=new ResponseWrapper<Integer>(10);
		var empData=new ResponseWrapper<Employee>
		                 (new Employee());
		var stringData=new ResponseWrapper("Message from Main");
		
		System.out.println(empData.toString());

	}
	
	private static long genData() {
		return new Random().nextInt(10000000);
	}

}
