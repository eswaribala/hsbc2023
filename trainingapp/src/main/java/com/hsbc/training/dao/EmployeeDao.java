package com.hsbc.training.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import com.hsbc.training.models.ConceptualTraining;
import com.hsbc.training.models.Employee;

public interface EmployeeDao {

	boolean addEmployee(Employee emp);
	TreeMap<Long,Employee> getAllEmployees();
	boolean registerTraining(Employee emp,ConceptualTraining training);
	Hashtable<Employee,List<ConceptualTraining>> registeredTrainings();
}
