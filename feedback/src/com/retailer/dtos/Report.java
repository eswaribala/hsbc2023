package com.retailer.dtos;

import com.retailer.models.Car;

public class Report {

	private Car car;
	
	private float averageFeedback;

	
	
	public Report(Car car, float averageFeedback) {
		super();
		this.car = car;
		this.averageFeedback = averageFeedback;
	}

	public Car getCar() {
		return car;
	}

	public float getAverageFeedback() {
		return averageFeedback;
	}

	@Override
	public String toString() {
		return "Report [car=" + car + ", averageFeedback=" + averageFeedback + "]";
	}
	
	
}
