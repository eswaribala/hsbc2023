package com.hsbc.training.models;

public class Employee {

	private long employeeId;
	private String name;	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(long employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}



	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
