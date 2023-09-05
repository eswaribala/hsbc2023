package com.hsbc.streamdemo.utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hsbc.streamdemo.models.Order;
import com.hsbc.streamdemo.models.Product;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //print distinct product names 
		getOrders().stream().map(o->o.getProducts())
		.flatMap(p->p.stream())
		.map(p->p.getName())
		.distinct()
		.forEach(System.out::println);
		
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
					of(2000+new Random().nextInt(22),
						1+new Random().nextInt(10), 
						1+new Random().nextInt(25)),
					products
					));
		}		
		return orders;
		
		
	}

}
