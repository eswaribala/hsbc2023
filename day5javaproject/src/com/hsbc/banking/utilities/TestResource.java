package com.hsbc.banking.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TestResource implements AutoCloseable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //multiple resources
		//try with resources
		try(Scanner scanner=new Scanner(System.in);
				Connection conn= DriverManager.getConnection(null)){
			
			System.out.println("Enter Name");
			String name=scanner.nextLine();
			System.out.println(name);
		}
		catch(NullPointerException|SQLException exception) {
			
		} 
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
