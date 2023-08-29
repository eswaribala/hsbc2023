package com.retailer.bl;

import java.sql.SQLException;
import java.util.List;

import com.retailer.models.Car;

public interface CarBL {

	boolean addCar(Car car);
	List<Car> getAllCars();
	Car getCarByModelName(String modelName);
    Car updateCarSeatingCapacity(Car car);
    boolean deleteCar(String modelName);
}
