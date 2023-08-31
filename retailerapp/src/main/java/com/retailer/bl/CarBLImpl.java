package com.retailer.bl;

import java.sql.SQLException;
import java.util.List;

import com.retailer.dao.CarDao;
import com.retailer.dao.CarDaoImpl;
import com.retailer.dao.CarDaoJPAImpl;
import com.retailer.exceptions.CarException;
import com.retailer.models.Car;

public class CarBLImpl implements CarBL{

	private CarDao carDao;
	
	public CarBLImpl(String instanceName) {
		super();
		// TODO Auto-generated constructor stub
		//instantiate dao implementation
		//factory pattern implementation
		if(instanceName.equals("JDBC"))
		 this.carDao=new CarDaoImpl();
		else
		 this.carDao=new CarDaoJPAImpl();	
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

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		List<Car> cars;
		try {
			cars=this.carDao.getAllCars();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new CarException("Cars Not Available"+e.getMessage());
		}
		
		return cars;
	}

	@Override
	public Car getCarByModelName(String modelName) {
		// TODO Auto-generated method stub
		Car car=null;
		try {
			car=this.carDao.getCarByModelName(modelName);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new CarException("Cars Not Available"+e.getMessage());
		}
		return car;
	}

	@Override
	public Car updateCarSeatingCapacity(Car car) {
		// TODO Auto-generated method stub
		Car carObj=null;
		try {
			carObj=this.carDao.updateCarSeatingCapacity(car);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new CarException("Cars Not Available"+e.getMessage());
		}
		return carObj;
	}

	@Override
	public boolean deleteCar(String modelName) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			status=this.carDao.deleteCar(modelName);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new CarException("Cars Not Available"+e.getMessage());
		}
		return status;
	}

	@Override
	public boolean addCars(List<Car> cars) {
		// TODO Auto-generated method stub
		boolean status=false;
		try {
			status=this.carDao.addCars(cars);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new CarException("Cars Not Available"+e.getMessage());
		}
		return status;
	}

}
