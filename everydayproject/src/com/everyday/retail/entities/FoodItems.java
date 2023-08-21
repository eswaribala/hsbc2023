package com.everyday.retail.entities;

import java.time.LocalDate;

public class FoodItems extends Product{
	  
	private LocalDate dateOfManufacturing;
	   private LocalDate dateOfExpiry;
	   private VegeterianType vegeterian;
   
	   public FoodItems(long itemCode, String name, int unitPrice, int qty) {
			super(itemCode, name, unitPrice, qty);
			// TODO Auto-generated constructor stub
		}  
	   
	public FoodItems(long itemCode, String name, int unitPrice, int qty, LocalDate dateOfManufacturing,
			LocalDate dateOfExpiry, VegeterianType vegeterian) {
		super(itemCode, name, unitPrice, qty);
		this.dateOfManufacturing = dateOfManufacturing;
		this.dateOfExpiry = dateOfExpiry;
		this.vegeterian = vegeterian;
	}

	public FoodItems() {
		// TODO Auto-generated constructor stub
		super();
	}

	public LocalDate getDateOfManufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public VegeterianType getVegeterian() {
		return vegeterian;
	}

	
	
	public void setVegeterian(VegeterianType vegeterian) {
		this.vegeterian = vegeterian;
	}

	@Override
	public String toString() {
		return "FoodItems [dateOfManufacturing=" + dateOfManufacturing + ", dateOfExpiry=" + dateOfExpiry
				+ ", vegeterian=" + vegeterian + ", itemCode=" + itemCode + ", name=" + name + ", unitPrice="
				+ unitPrice + ", qty=" + qty + "]";
	}
	   
   

}
