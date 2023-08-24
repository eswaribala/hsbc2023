package com.hsbc.banking.dao;

import java.io.IOException;

import com.hsbc.banking.models.Car;

/**
 * 
 * @author Balasubramaniam
 * @version 1.0
 * @since 24/08/2023
 *
 */
public interface CarDao {

	boolean createCarStore() throws IOException;
	boolean storeCars(Car[] cars) throws IOException;
	Car[] retrieveCars()throws IOException;
	boolean duplicateCarFileContent() throws IOException;
	
}
