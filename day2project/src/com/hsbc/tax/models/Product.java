package com.hsbc.tax.models;

public class Product {
	private int productNo;
	private int qty;
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", qty=" + qty + "]";
	}

}
