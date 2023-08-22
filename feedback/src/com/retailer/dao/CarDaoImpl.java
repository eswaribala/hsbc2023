package com.retailer.dao;

import com.retailer.models.Car;

public class CarDaoImpl implements CarDao{

	
	
	@Override
	public Car[] generateCars() {
		// TODO Auto-generated method stub
		String[] models= {"Ford Ecosport","Toyota Innova","Hyundai i20"};
	    byte[] capacity= {5,7,5};
		Car[] cars=new Car[3];
	    for(int i=0;i<cars.length;i++) {
	    	cars[i]=new Car(models[i],capacity[i]);
	    }	    
		
		return cars;
	}

}
