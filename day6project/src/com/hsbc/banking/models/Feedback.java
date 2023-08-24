package com.hsbc.banking.models;

import java.io.Serializable;

public class Feedback implements Serializable{

	private String name;
	private String city;
	private transient Car car;
	private String modelName;
	private byte seatComfortRating;
	private byte drivingComfortRating;	
	
	public Feedback(String name, String city, 
			String modelName, byte seatComfortRating, byte drivingComfortRating) {
		super();
		this.name = name;
		this.city = city;
		this.modelName = modelName;
		this.seatComfortRating = seatComfortRating;
		this.drivingComfortRating = drivingComfortRating;
	}
	
	
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public byte getSeatComfortRating() {
		return seatComfortRating;
	}
	public void setSeatComfortRating(byte seatComfortRating) {
		this.seatComfortRating = seatComfortRating;
	}
	public byte getDrivingComfortRating() {
		return drivingComfortRating;
	}
	public void setDrivingComfortRating(byte drivingComfortRating) {
		this.drivingComfortRating = drivingComfortRating;
	}


	
	
	
}
