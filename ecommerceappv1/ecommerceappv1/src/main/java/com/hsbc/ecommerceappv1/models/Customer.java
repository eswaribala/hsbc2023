package com.hsbc.ecommerceappv1.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String contactNo;
	private String gender;
	private String address;
	
}
