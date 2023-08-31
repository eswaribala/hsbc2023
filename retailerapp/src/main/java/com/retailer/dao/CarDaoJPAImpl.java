package com.retailer.dao;

import java.sql.SQLException;
import java.util.List;

import com.retailer.models.Car;

public class CarDaoJPAImpl implements CarDao{

	@Override
	public boolean addCar(Car car) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Car> getAllCars() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car getCarByModelName(String modelName) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car updateCarSeatingCapacity(Car car) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCar(String modelName) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCars(List<Car> cars) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
