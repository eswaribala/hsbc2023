package com.retailer.bl;

import java.util.List;

import com.retailer.models.Car;

public interface CarBL {

	boolean addCar(Car car);
	List<Car> getAllCars();
}
