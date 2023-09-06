package com.continental.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ParallelTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		//the size of the underlying thread-pool uses up to five threads 
		// depending on the amount of available physical CPU cores:
		System.out.println(commonPool.getParallelism());    // 3
		
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}	    
		    
		    //sequential sort
		    long t0 = System.nanoTime();
		    long count = values.stream().sorted().count();
		    System.out.println(count);
		    long t1 = System.nanoTime();
		    long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		    System.out.println(String.format("sequential sort took: %d ms", millis));		    
		    //parallel sort
		    long t01 = System.nanoTime();
		    long count1 = values.parallelStream().sorted().count();
		    System.out.println(count1);
		    long t11 = System.nanoTime();
		    long millis1 = TimeUnit.NANOSECONDS.toMillis(t11 - t01);
		    System.out.println(String.format("parallel sort took: %d ms", millis1));		
		
	}

}
