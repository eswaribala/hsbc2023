package com.retailer.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.retailer.bl.CarBL;
import com.retailer.bl.CarBLImpl;
import com.retailer.exceptions.CarException;
import com.retailer.models.Car;

public class Retailer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car=null;
        //instantiate car business layer
        //factory invocation
        CarBL carBL=new CarBLImpl("JDBC");		
        //retrieve car
        
        try {
        	System.out.println(carBL.addCars(generateCars()));
        
        }
        catch(CarException e) {
        	System.out.println(e.getMessage());
        }
        
		
	}

	private static List<Car> generateCars(){
		List<Car> cars=new ArrayList<Car>();
		for(int i=0;i<100;i++)
			cars.add(new Car("car"+i,
					(byte)(4+new Random().nextInt(3))));
		return cars;
	}
	
	
	private static void add(CarBL carBL) {
		Car car;
		try(Scanner scanner=new Scanner(System.in);) {
			car=new Car();
			System.out.println("Enter model name");
			car.setModelName(scanner.nextLine());
			System.out.println("Enter Seating capacity");
			car.setSeatingCapacity(scanner.nextByte());
			scanner.nextLine();
			System.out.println(carBL.addCar(car));			
		}
		catch(CarException e) {
			System.out.println(e.getMessage());
		}
	}

}
