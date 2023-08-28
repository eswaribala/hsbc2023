package com.amazon.ecomm.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data=List.of("T1","T2","T3");
		System.out.println(data);
		//data.add("T4");
		Set<String> traineesSet2020=new HashSet<String>();
		Set<String> traineesSet2021=new HashSet<String>();
		for(int i=0;i<10;i++)
			traineesSet2020.add("Trainee"+i);	
		for(int i=7;i<20;i++)
			traineesSet2021.add("Trainee"+i);	
		Set<String> set=(Set<String>) Collections.
				unmodifiableCollection(traineesSet2020);
		set.add("T100");
 		
		/*
		 * List<String> newData=new ArrayList<String>(); newData.addAll(data);
		 * System.out.println(newData); System.out.println(data);
		 */
		
		
	}

}
