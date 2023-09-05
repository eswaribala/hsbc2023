package com.hsbc.streamdemo.models;

import java.time.LocalDate;

public class Product {
	
	private long productCode;
	private String name;
	private LocalDate dop;
	private int cost;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long productCode, String name, LocalDate dop, int cost) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.dop = dop;
		this.cost = cost;
	}
	public long getProductCode() {
		return productCode;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDop() {
		return dop;
	}
	public int getCost() {
		return cost;
	}
	

}
