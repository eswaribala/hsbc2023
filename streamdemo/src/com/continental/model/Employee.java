package com.continental.model;

import static com.continental.enums.Gender.FEMALE;
import static com.continental.enums.Gender.MALE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.continental.enums.Gender;

public class Employee {
	private String firstName;
	private String lastName;
	private LocalDate doj;
	private Gender gender;
	public Employee()
	{
		
	}
	public Employee(String firstName, String lastName, LocalDate doj, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
		this.gender = gender;
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
	return firstName + " " + lastName + ", " + gender + ", " + doj;
	}
	// A utility method
	public static List<Employee> getEmployees() {
	ArrayList<Employee> list = new ArrayList<>();
	list.add(new Employee("Kavitha", "Kumar", LocalDate.of(2017, 1, 20), MALE));
	list.add(new Employee("David", "Johnson", LocalDate.of(1965, 9, 12), FEMALE));
	list.add(new Employee("Geetha", "Priya", LocalDate.of(1970, 9, 12), FEMALE));
	list.add(new Employee("Dharam", "Singh", LocalDate.of(1970, 9, 12), FEMALE));
	return list;
	}
}
