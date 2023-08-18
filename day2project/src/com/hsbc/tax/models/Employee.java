package com.hsbc.tax.models;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private long employeeNo;
	private String name;
	private LocalDate doj;
	private int experience;
	public long getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", name=" + name + ", doj=" + doj + ", experience=" + experience
				+ "]";
	}
	@Override
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		
		
		if(this.experience==employee.experience)
			return 0;
		else if(this.experience >= employee.experience)
               return 1;
        else
            	   return -1;
		
	}
	
	

}
