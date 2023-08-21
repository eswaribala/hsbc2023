package com.everyday.retail.entities;

public class Electronics extends Product {

	private byte warranty; 
	public Electronics(long itemCode, String name, int unitPrice, int qty) {
		super(itemCode, name, unitPrice, qty);
		// TODO Auto-generated constructor stub
	}
	public Electronics(long itemCode, String name, int unitPrice, int qty, byte warranty) {
		super(itemCode, name, unitPrice, qty);
		this.warranty = warranty;
	}
	
	
	public Electronics() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void setWarranty(byte warranty) {
		this.warranty = warranty;
	}
	public byte getWarranty() {
		return warranty;
	}
	@Override
	public String toString() {
		return "Electornics [warranty=" + warranty + ", itemCode=" + itemCode + ", name=" + name + ", unitPrice="
				+ unitPrice + ", qty=" + qty + "]";
	}

	
	
}
