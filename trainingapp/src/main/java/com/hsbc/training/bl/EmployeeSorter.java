package com.hsbc.training.bl;

import java.util.Comparator;

import com.hsbc.training.models.Employee;

public class EmployeeSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmployeeId()>o2.getEmployeeId())
			return 1;
		else if(o1.getEmployeeId()<o2.getEmployeeId())
			return -1;
		else
			return 0;
			
	}

}
