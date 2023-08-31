package com.retailer.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySQLHelper {
	
	private static ResourceBundle resourceBundle;
	//singleton pattern implemented
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		resourceBundle=ResourceBundle
				.getBundle("db");
		String userName=resourceBundle.getString("userName");
		String password=resourceBundle.getString("password");
		String url=resourceBundle.getString("url");
		String driver=resourceBundle.getString("driverClassName");
		//Step1 load the driver
		Class.forName(driver);
		//create the connection
		return DriverManager.getConnection(url, userName, 
				password);
		
		
		
	}

}
