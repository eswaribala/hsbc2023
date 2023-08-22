package com.everyday.retail.entities;

public class Product {
//implements Comparable<Product> {
	
	protected long itemCode;
	protected String name;
	protected int unitPrice;
	protected int qty;
	
	public Product(long itemCode, String name, int unitPrice, int qty) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public long getItemCode() {
		return itemCode;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getQty() {
		return qty;
	}

	
	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", name=" + name + ", unitPrice=" + unitPrice + ", qty=" + qty + "]";
	}

	/*
	 * @Override public int compareTo(Product o) { // TODO Auto-generated method
	 * stub if(this.qty>o.qty) return -1; else if(this.qty<o.qty) return 1; else
	 * return 0; }
	 */
	

}
