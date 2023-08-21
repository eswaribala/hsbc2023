package com.everyday.retail.entities;

public class Apparel extends Product{

	private SizeType size;
	private MaterialType materialType;
	
	public Apparel(long itemCode, String name, int unitPrice, int qty) {
		super(itemCode, name, unitPrice, qty);
		// TODO Auto-generated constructor stub
	}

	public Apparel(long itemCode, String name, int unitPrice, int qty, SizeType size, MaterialType materialType) {
		super(itemCode, name, unitPrice, qty);
		this.size = size;
		this.materialType = materialType;
	}

	
	
	public Apparel() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void setSize(SizeType size) {
		this.size = size;
	}

	public void setMaterialType(MaterialType materialType) {
		this.materialType = materialType;
	}

	public SizeType getSize() {
		return size;
	}

	public MaterialType getMaterialType() {
		return materialType;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", materialType=" + materialType + ", itemCode=" + itemCode + ", name=" + name
				+ ", unitPrice=" + unitPrice + ", qty=" + qty + "]";
	}

	
	
	
}
