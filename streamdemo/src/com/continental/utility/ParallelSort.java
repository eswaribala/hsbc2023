package com.continental.utility;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ParallelSort {


    public static void main( String[] args )
    {
    	
    	//-Djava.util.concurrent.ForkJoinPool.common.parallelism=10
    	//parallel stream
    	ForkJoinPool commonPool = ForkJoinPool.commonPool();
    	System.out.println("Parallel"+commonPool.getParallelism());    // 3
        Double[] unsorted = new Double[10000000];
        for( int i = 0; i < unsorted.length; i++ )
        {
            unsorted[i] = random( i, unsorted.length );
            // System.out.println(unsorted[i]);
        }

        long start = System.currentTimeMillis();
        Arrays.sort( unsorted );
        long end = System.currentTimeMillis();

        System.out.println( "time: " + ( end - start ) + " ms." );

        start = System.currentTimeMillis();
        Arrays.parallelSort( unsorted );
        end = System.currentTimeMillis();

        System.out.println( "time: " + ( end - start ) + " ms." );

    }

    private static Double random( int i, int length )
    {
        return Math.random() * i % length;
    }
}


