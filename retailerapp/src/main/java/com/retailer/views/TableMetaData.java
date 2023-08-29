package com.retailer.views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.retailer.helpers.MySQLHelper;

public class TableMetaData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement statement;
		ResourceBundle resourceBundle=
				ResourceBundle.getBundle("db");
		ResultSet resultSet=null;
		ResultSetMetaData metaData=null;
		String query=resourceBundle.getString("getallcars");
		int cols=0;
		//retrieve table info;
		try {
			conn=MySQLHelper.getConnection();
			statement=conn.createStatement();
			resultSet=statement.executeQuery(query);
			metaData=resultSet.getMetaData();
			cols=metaData.getColumnCount();
			for(int i=1;i<=cols;i++) {
				System.out.println(metaData.getColumnName(i));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally {
			conn.close();
		}

	}

}
