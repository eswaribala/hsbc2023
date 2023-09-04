package com.hsbc.lambdasdemo.models;

import java.time.LocalDate;

public class Employee {
	private long employeeNo;
	private String name;
	private LocalDate doj;
	public Employee(long employeeNo, String name, LocalDate doj) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.doj = doj;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmployeeNo() {
		return employeeNo;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	
	

}
