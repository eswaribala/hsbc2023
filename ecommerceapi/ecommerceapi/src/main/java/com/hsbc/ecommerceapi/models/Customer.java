package com.hsbc.ecommerceapi.models;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_Id")
    private long customerId;  
	@Column(name="First_Name",nullable = false,length = 50)
	private String firstName;
	@Column(name="Last_Name",nullable = false,length = 50)
	private String lastName;
	@Column(name="DOB")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dob;
	@Column(name="Email",nullable = false,length = 150)
	private String email;
	@Column(name="Contact_No")
	private long contactNo;
	@Enumerated(EnumType.STRING)
	@Column(name="Gender")
	private Gender gender;
	@Column(name="Address")
	private String address;
	
}
