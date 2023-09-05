package com.hsbc.streamdemo.utilities;

import java.util.concurrent.ForkJoinPool;

public class ParallelTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ForkJoinPool fj=ForkJoinPool.commonPool();	
	System.out.println(fj.getParallelism());
	
	
	}

}
