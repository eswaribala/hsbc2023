package com.hsbc.training.dao;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.hsbc.training.bl.EmployeeSorter;
import com.hsbc.training.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.training.models.ConceptualTraining;
import com.hsbc.training.models.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private TreeMap<Long,Employee> employees;		

	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		this.employees=new TreeMap(new EmployeeSorter());
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(this.employees.containsKey(emp.getEmployeeId()))
			throw new EmployeeAlreadyExistsException("Employee Exists");
		else
		    this.employees.put(emp.getEmployeeId(), emp);
		return true;
	}

	@Override
	public TreeMap<Long,Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.employees;
	}

	@Override
	public boolean registerTraining(ConceptualTraining training) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hashtable<Employee, List<ConceptualTraining>> registeredTrainings() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
