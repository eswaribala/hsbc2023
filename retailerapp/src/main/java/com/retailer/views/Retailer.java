package com.retailer.views;

import java.util.Scanner;

import com.retailer.bl.CarBL;
import com.retailer.bl.CarBLImpl;
import com.retailer.exceptions.CarException;
import com.retailer.models.Car;

public class Retailer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Car car=null;
        //instantiate car business layer
        CarBL carBL=new CarBLImpl();		
        //retrieve cars
        try {
        for(Car car : carBL.getAllCars()) {
        	System.out.println(car.getModelName()+","
        +car.getSeatingCapacity());
        }
        }
        catch(CarException e) {
        	System.out.println(e.getMessage());
        }
        
		
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
