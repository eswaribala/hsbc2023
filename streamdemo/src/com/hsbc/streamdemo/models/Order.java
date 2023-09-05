package com.hsbc.streamdemo.models;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private long orderId;
	private LocalDate orderDate;
	List<Product> products;	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long orderId, LocalDate orderDate, List<Product> products) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.products = products;
	}
	public long getOrderId() {
		return orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	
}
