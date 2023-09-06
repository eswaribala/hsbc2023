package com.continental.utility;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {23,43,56,97,32};
	//reduce to sum
  	  Arrays.stream(array).reduce((x,y) -> x+y).
  	  ifPresent(s -> System.out.println(s)); 
  	  
  	  
  	  Arrays.stream(array).reduce(Integer::sum)
  	  .ifPresent(s -> System.out.println(s));
  	  Arrays.stream(array).reduce(StatisticsUtility::addIntData)
  	  .ifPresent(s -> System.out.println(s));
  	  
  	  
  	int[] arrayInst = {23,43,56,97,32};
	  //Set start value. Result will be start value + sum of array. 
	  int startValue = 100;
	  int sum = Arrays.stream(arrayInst ).reduce(startValue, (x,y) -> x+y);
	  System.out.println(sum);
	  
	  
	  
	  
	  
	  
	  sum = Arrays.stream(arrayInst ).reduce(startValue, Integer::sum);
	  System.out.println(sum);
	  sum = Arrays.stream(arrayInst ).reduce(startValue, StatisticsUtility::addIntData);
	  System.out.println(sum);
  	  
	  List<Integer> list2 = Arrays.asList(2, 3, 4);
     
      int res = list2.stream().reduce(3, (s1, s2) -> {
    	  System.out.println(s1+"-->"+s2);
    	  return (s1 * s2);},(p, q) -> p + q);
      System.out.println("Sequence Result"+res);
      
      List<Integer> list3 = Arrays.asList(2, 3, 4);
      
      int res1 = list3.parallelStream().reduce(3, (s1, s2) -> {
    	  System.out.println(s1+"-->"+s2);
    	  return (s1 * s2);},(p, q) -> p + q);
      
      System.out.println("Parallel Result"+res1);
      
      
      
      List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
      String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2, (p, q) -> p + q);
      System.out.println(result);
      
    //Reduce Array to String.
    		String[] arrayStr = {"Mohan", "Sohan", "Mahesh"};
    		Arrays.stream(arrayStr).reduce((x, y) -> x +"," + y)
    		       .ifPresent(s -> System.out.println("Array to String: "+ s));
    		//Reduce List to String.
    		List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");
    		list.stream().reduce((x, y) -> x +"," + y)
    			       .ifPresent(s -> System.out.println("List to String: "+ s));
	  
	}

}
