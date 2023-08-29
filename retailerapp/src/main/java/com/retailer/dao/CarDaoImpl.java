package com.retailer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.retailer.helpers.MySQLHelper;
import com.retailer.models.Car;

public class CarDaoImpl implements CarDao {

	private Connection conn;
	private PreparedStatement statement;
	private ResourceBundle resourceBundle;
	
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

}
