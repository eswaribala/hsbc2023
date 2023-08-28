package com.amazon.ecomm.views;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Set<String> traineesSet2020=new HashSet<String>();
	Set<String> traineesSet2021=new HashSet<String>();
	for(int i=0;i<10;i++)
		traineesSet2020.add("Trainee"+i);	
	for(int i=7;i<20;i++)
		traineesSet2021.add("Trainee"+i);	
	//union operation	
	//traineesSet2020.addAll(traineesSet2021);
	
	//for(String data: traineesSet2020)
	//	System.out.println(data);
		
	//System.out.println("Size"+traineesSet2020.size());
	
	//intersection
	traineesSet2020.retainAll(traineesSet2021);
	System.out.println("Size"+traineesSet2020.size());
	
	
		
	}

}
