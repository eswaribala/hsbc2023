package com.retailer.models;

public class Feedback {

	private String name;
	private String city;
	private Car car;
	private byte seatComfortRating;
	private byte drivingComfortRating;	
	
	public Feedback(String name, String city, Car car, byte seatComfortRating, byte drivingComfortRating) {
		super();
		this.name = name;
		this.city = city;
		this.car = car;
		this.seatComfortRating = seatComfortRating;
		this.drivingComfortRating = drivingComfortRating;
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
