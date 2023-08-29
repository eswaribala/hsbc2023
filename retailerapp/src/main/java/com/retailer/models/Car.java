package com.retailer.models;

public class Car {
	private String modelName;
	private byte seatingCapacity;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String modelName, byte seatingCapacity) {
		super();
		this.modelName = modelName;
		this.seatingCapacity = seatingCapacity;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public byte getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(byte seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	

}
