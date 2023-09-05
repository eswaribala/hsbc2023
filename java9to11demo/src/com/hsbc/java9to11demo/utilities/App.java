package com.hsbc.java9to11demo.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.time.LocalDate;
import com.hsbc.java9to11demo.dtos.ResponseWrapper;
import com.hsbc.java9to11demo.facades.NotNull;
import com.hsbc.java9to11demo.facades.OTPGenerator;
import com.hsbc.java9to11demo.facades.TriFunction;
import com.hsbc.java9to11demo.models.Employee;

public class App {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable type inference
		var randomData=genData();		
		var data=new ResponseWrapper<Integer>(10);
		var empData=new ResponseWrapper<Employee>
		                 (new Employee());
		var stringData=new ResponseWrapper("Message from Main");
		
		System.out.println(empData.toString());
		
		//var in lambdas
		
		BiFunction<Employee,LocalDate,Boolean> bfn=(@NotNull var v1,
				var v2)->{
			
			if(v1.getDoj().isBefore(v2))
				return true;
			else
				return false;
		};
		
		bfn.apply(new Employee(new Random().nextInt(10000),
					"Parameswari",LocalDate.
					of(2000+new Random().nextInt(22),
						1+new Random().nextInt(10), 
						1+new Random().nextInt(25))), LocalDate.now());
		
	
	//Tri function
		TriFunction<Employee,LocalDate,Integer,Boolean> tfn=(@NotNull var v1,
				var v2, var v3)->{
			
			if((v1.getDoj().isBefore(v2))&& (v1.getEmployeeNo()>=v3))
				return true;
			else
				return false;
		};
		
		tfn.apply(new Employee(new Random().nextInt(10000),
				"Parameswari",LocalDate.
				of(2000+new Random().nextInt(22),
					1+new Random().nextInt(10), 
					1+new Random().nextInt(25))), LocalDate.now(),8900);	
		
	   //var numbers={1,2,3,5}; //array initializers cannot be assigned
	   
	   //var list=new ArrayList<>();
	   var list=List.of("1","2","3");
	   
	   OTPGenerator otpGen=(var v1)->{
		   return (short) new Random().nextInt(v1);
	   };
	   otpGen.getOTP(10000);
	   
	  
		

	}
	
	private static long genData() {
		return new Random().nextInt(10000000);
	}

}
