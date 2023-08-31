package com.hsbc.training.bl;

import java.util.TreeMap;

import com.hsbc.training.models.ConceptualTraining;
import com.hsbc.training.models.Employee;

public interface EmployeeBL {
	boolean addEmployee(Employee emp);
	TreeMap<Long,Employee> getAllEmployees();
	boolean registerTraining(Employee emp,ConceptualTraining training);

}
