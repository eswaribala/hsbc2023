package com.retailer.dao;

import java.sql.SQLException;
import java.util.List;

import com.retailer.models.Car;

public interface CarDao {

	boolean addCar(Car car) throws ClassNotFoundException, SQLException;
    List<Car> getAllCars() throws ClassNotFoundException, SQLException ;
}
