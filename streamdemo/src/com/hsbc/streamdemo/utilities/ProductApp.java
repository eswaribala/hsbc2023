package com.hsbc.streamdemo.utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hsbc.exceptions.OrderDateException;
import com.hsbc.streamdemo.models.Order;
import com.hsbc.streamdemo.models.Product;

public class ProductApp {

	public static void main(String[] args) {

	Optional<Object> optional=Optional.empty();
	
		try {
			optional.orElseThrow(()->new 
					OrderDateException("Date not present"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	private static List<Order> getOrders(){		
		List<Order> orders=new ArrayList<Order>();
		List<Product> products;
		for(int i=0;i<100;i++) {
			products=new ArrayList<Product>();
			for(int j=0;j<1+new Random().nextInt(7);j++) {
				products.add(new Product(new Random().nextInt(10000),
						"Product"+i,LocalDate.
						of(2000+new Random().nextInt(22),
								1+new Random().nextInt(10), 
								1+new Random().nextInt(25)),
						new Random().nextInt(10000)));
			}
			orders.add(new Order(new Random().nextInt(10000),
					LocalDate.
					of(2000+new Random().nextInt(23),
						1+new Random().nextInt(10), 
						1+new Random().nextInt(25)),
					products
					));
		}		
		return orders;
		
		
	}
	
	
	public void test() {
		getOrders().stream().map(o->o.getProducts())
		.flatMap(p->p.stream())
		.map(p->p.getName())
		.distinct()
		.forEach(System.out::println);
		
		//cumulative sum
		int result=getOrders().stream()
				.map(o->o.getProducts())
				.flatMap(p->p.stream())
		        .map(product->product.getCost())  
		        .reduce(0,Integer::sum);  
		System.out.println(result);
		
		//allmatch
		System.out.println(getOrders().stream()
		.map(o->o.getProducts())
		.flatMap(p->p.stream())
		.allMatch(p->p.getName().endsWith("99")));
		
				
		//nonematch
		System.out.println(getOrders().stream()
				.map(o->o.getProducts())
				.flatMap(p->p.stream())
				.noneMatch(p->p.getName().endsWith("99")));
				
		
		//anymatch
		System.out.println(getOrders().stream()
				.map(o->o.getProducts())
				.flatMap(p->p.stream())
				.anyMatch(p->p.getName().endsWith("99")));
		
	
	
		Map<Long, Product> resultMap = 
				getOrders().stream()
				.map(o->o.getProducts())
				.flatMap(p->p.stream()) 
				.collect(Collectors.toMap
						(Product::getProductCode, p -> p));

		
		
		//accumulator		
		long result123=getOrders().stream().map(o->o.getProducts())
			.flatMap(p->p.stream())
			.mapToLong(Product::getCost).sum();
		
		System.out.println(result123);
		//passing function as parameter	
		LongAccumulator longAccumulator=new LongAccumulator((x,y)
				->x+y,0);
		
		List<Integer> costs= getOrders().stream()
				.map(o->o.getProducts())
		.flatMap(p->p.stream())
		.map(p->p.getCost())
		.collect(Collectors.toList());	
		costs.forEach(longAccumulator::accumulate);
		System.out.println("Long Accumulated Value="
		+longAccumulator.longValue());	
		
		LongAdder longAdder=new LongAdder();
		costs.forEach(longAdder::add);
		System.out.println("Long Adder Value="
				+longAdder.longValue());
			
		//optional
		
		Optional<Order> order= getOrders().stream().findFirst();
		
		if(order.isPresent())
			System.out.println(order.get().getOrderId());
		else
			System.out.println("Order Not available");
		
		Order orderData= getOrders().stream().findFirst().orElse(null);
		
		Optional<List<Order>> optionalOrders=Optional.of(getOrders());
		
		optionalOrders.map(o->o.get(0).getProducts())
		.map(p->p.get(0).getName()).ifPresent(System.out::println);
		//dropwhile		
				/*
				 * getOrders().stream() .sorted((o1,o2)->{return o1.getOrderDate()
				 * .compareTo(o2.getOrderDate());})
				 * .dropWhile(o->o.getOrderDate().isBefore(LocalDate.of(2017,1,1)))
				 * .map(o->o.getOrderId()+","+o.getOrderDate()) .forEach(System.out::println);
				 */
				
				getOrders().stream()
				.sorted((o1,o2)->{
					if(o1.getOrderId()<o2.getOrderId())
						return 1;
					else if(o1.getOrderId()>o2.getOrderId())
						return -1;
					else
						return 0;			
				})
				.dropWhile(o->(o.getOrderId()>8000))
				
				.map(o->o.getOrderId()+","+o.getOrderDate())
				.forEach(System.out::println);
				
				List<LocalDate> dates=getOrders().stream()			
						.filter(o->o.getOrderDate()
								.isAfter(LocalDate.of(2022, 12, 31)))
						.map(o->o.getOrderDate())
						.collect(Collectors.toList());
					
					Optional<List<LocalDate>> optional=Optional.of(dates);
					Optional<LocalDate> optional1=null;
					if(optional.isEmpty())
					{
						optional1=Optional.empty();
						System.out.println(optional.get());
					}
					else
						System.out.println("No order present");
							
							
						
						  try { 
							 
						  optional1.orElseThrow(()-> new
						  OrderDateException ("No order placed for 2023")); 
						  } 
						  catch(OrderDateException  e)
						  { 
							  System.out.println(e.getMessage()); 
						  }
						 
	}

}
