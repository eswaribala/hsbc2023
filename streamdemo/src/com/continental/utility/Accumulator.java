package com.continental.utility;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.LongAdder;

import com.continental.business.ProductInfo;
import com.continental.model.Product;

public class Accumulator {

	public static void main(String[] args) {
		long sum = ProductInfo.getProducts().stream().
				  filter(p ->p.getName().equals("Laptop")).
				  mapToLong(Product::getPurchaseCost).
				  sum();
		
		DoubleAccumulator da = 
				new DoubleAccumulator((x,y) -> x + y, 0.0);
		List<Double> doubles = Arrays.
				asList(1.0, 2.0, 3.0, 4.0, 10.0);
		doubles.forEach(da::accumulate);

		System.out.println("Result: " + da.doubleValue());
		LongAdder la = new LongAdder();
		List<Long> longs = Arrays.asList(10L, 20L, 30L, 40L, 100L);
		longs.forEach(la::add);

		System.out.println("Result: " + la.longValue());

	}
}
