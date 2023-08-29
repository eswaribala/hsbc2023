package com.retailer.dao;

import java.sql.SQLException;

import com.retailer.models.Car;

public interface CarDao {

	boolean addCar(Car car) throws ClassNotFoundException, SQLException;
}
