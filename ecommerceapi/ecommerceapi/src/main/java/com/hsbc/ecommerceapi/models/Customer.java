package com.hsbc.ecommerceapi.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long customerId;  
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String contactNo;
	private String gender;
	private String address;
	
}
