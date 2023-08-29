package com.retailer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.retailer.helpers.MySQLHelper;
import com.retailer.models.Car;

public class CarDaoImpl implements CarDao {

	private Connection conn;
	private PreparedStatement statement;
	private ResourceBundle resourceBundle;
	private ResultSet resultSet;
	
	//read properties
	public CarDaoImpl() {
		super();
		this.resourceBundle=ResourceBundle.getBundle("db");
	}

	@Override
	public boolean addCar(Car car) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 2 get connection
		
		conn=MySQLHelper.getConnection();
		int rows=0;
		String query=this.resourceBundle.getString("addcar");
		try{
			//step3 create statement
			this.statement=this.conn.prepareStatement(query);
			this.statement.setString(1, car.getModelName());
			this.statement.setByte(2, car.getSeatingCapacity());
			//step 4 execute the statement and get results
			rows=this.statement.executeUpdate();
		}
		finally {
			//step 5 close the connection
			conn.close();
		}
		if(rows>0)
       		return true;
		else
			return false;
	}

	@Override
	public List<Car> getAllCars() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 2 get connection
		conn=MySQLHelper.getConnection();
		String query=this.resourceBundle.getString("getallcars");
		List<Car> cars=new ArrayList<Car>();
	    try{
					//step3 create statement
		  this.statement=this.conn.prepareStatement(query);
		  this.resultSet=this.statement.executeQuery();
		  //step 4
		  while(this.resultSet.next()) {
			  cars.add(new Car(this.resultSet.getString(1),this.resultSet.getByte(2)));
		  }
	    }
	    finally
	    {
	    	//step5 
	    	conn.close();
	    }
		return cars;
	}

	@Override
	public Car getCarByModelName(String modelName) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 2 get connection
		conn=MySQLHelper.getConnection();
		String query=this.resourceBundle.getString("getcarbymodelname");
		Car car=null;
	    try{
					//step3 create statement
		  this.statement=this.conn.prepareStatement(query);
		  this.statement.setString(1, modelName);
		  this.resultSet=this.statement.executeQuery();
		  this.resultSet.next();
		  car=new Car(this.resultSet.getString(1),
				  this.resultSet.getByte(2));
	    }
	    finally
	    {
	    	//step5 
	    	conn.close();
	    }
		return car;
	}

	@Override
	public Car updateCarSeatingCapacity(Car car) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//step 2 get connection
		
		conn=MySQLHelper.getConnection();
		int rows=0;
		String query=this.resourceBundle.getString("updatecar");
		try{
			//step3 create statement
			this.statement=this.conn.prepareStatement(query);
			this.statement.setString(2, car.getModelName());
			this.statement.setByte(1, car.getSeatingCapacity());
			//step 4 execute the statement and get results
			rows=this.statement.executeUpdate();
						
		}
		finally {
			//step 5 close the connection
			conn.close();
		}
		return getCarByModelName(car.getModelName());
	}

	@Override
	public boolean deleteCar(String modelName) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		conn=MySQLHelper.getConnection();
		int rows=0;
		String query=this.resourceBundle.getString("deletecar");
		try{
			//step3 create statement
			this.statement=this.conn.prepareStatement(query);
			this.statement.setString(1, modelName);			
			//step 4 execute the statement and get results
			rows=this.statement.executeUpdate();						
		}
		finally {
			//step 5 close the connection
			conn.close();
		}
		if(rows>0)
	 	 return true;
		else
			return false;
	}

}
