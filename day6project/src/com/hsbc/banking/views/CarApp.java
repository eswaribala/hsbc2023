package com.hsbc.banking.views;

import java.io.IOException;

import com.hsbc.banking.dao.CarDao;
import com.hsbc.banking.dao.CarDaoImpl;
import com.hsbc.banking.models.Car;


public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CarDao carDao=new CarDaoImpl();
     String[] models= {"Ford Ecosport","Toyota Innova","Hyundai i20"};
	 byte[] capacity= {5,7,5};
	 Car[] cars=new Car[3];
	 try {
		System.out.println(carDao.createCarStore());		
	   // extracted(carDao, models, capacity, cars);
	    //read(carDao);
		System.out.println(carDao.duplicateCarFileContent());
		
	} catch (IOException ioException) {
		System.out.println(ioException.getMessage());
	}
	}

	private static void read(CarDao carDao) throws IOException {
		for(Car car : carDao.retrieveCars()) {
	    	System.out.println(car);
	    }
	}

	private static void write(CarDao carDao, String[] models, byte[] capacity, Car[] cars) throws IOException {
		for(int i=0;i<cars.length;i++) {
	    	cars[i]=new Car(models[i],capacity[i]);
	    }	    
	    System.out.println(carDao.storeCars(cars));
	}

}
