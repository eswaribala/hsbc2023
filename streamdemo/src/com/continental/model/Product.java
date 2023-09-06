package com.continental.model;

import java.util.Date;

public class Product {

	private int productCode;
	private String name;
	private long purchaseCost;
	private Date dop;
	public Product(int productCode, String name, long purchaseCost, Date dop) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.purchaseCost = purchaseCost;
		this.dop = dop;
	}
	public int getProductCode() {
		return productCode;
	}
	public String getName() {
		return name;
	}
	public long getPurchaseCost() {
		return purchaseCost;
	}
	public Date getDop() {
		return dop;
	}
	
	
	
	
}
