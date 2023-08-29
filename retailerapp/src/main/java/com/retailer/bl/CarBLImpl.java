package com.retailer.bl;

import java.sql.SQLException;

import com.retailer.dao.CarDao;
import com.retailer.dao.CarDaoImpl;
import com.retailer.exceptions.CarException;
import com.retailer.models.Car;

public class CarBLImpl implements CarBL{

	private CarDao carDao;
	
	public CarBLImpl() {
		super();
		// TODO Auto-generated constructor stub
		//instantiate dao implementation
		this.carDao=new CarDaoImpl();
	}

	@Override
	public boolean addCar(Car car) {
		// TODO Auto-generated method stub
		try {
			//invoke dao layer insert query
			this.carDao.addCar(car);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			//rethrow custom exception
			throw new CarException("Car not added"+e.getMessage());
		}
		
		return true;
	}

}
