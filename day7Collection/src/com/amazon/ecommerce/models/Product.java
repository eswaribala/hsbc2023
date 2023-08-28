package com.amazon.ecommerce.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable{
	
	private long productNo;
	private String name;
	//Date of Manufacturing
	private LocalDate dom;
	private long unitPrice;
	public Product(long productNo, String name, LocalDate dom, long unitPrice) {
		super();
		this.productNo = productNo;
		this.name = name;
		this.dom = dom;
		this.unitPrice = unitPrice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public long getProductNo() {
		return productNo;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDom() {
		return dom;
	}
	public long getUnitPrice() {
		return unitPrice;
	}
	
	
	
	
	
	

}
