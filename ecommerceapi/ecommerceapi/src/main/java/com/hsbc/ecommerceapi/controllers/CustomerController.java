package com.hsbc.ecommerceapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.ecommerceapi.dtos.ResponseWrapper;
import com.hsbc.ecommerceapi.models.Customer;
import com.hsbc.ecommerceapi.repositories.CustomerRepository;
import com.hsbc.ecommerceapi.services.CustomerService;

@RestController
//naming convention
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;	
	@PostMapping("/v1.0/")
	public ResponseEntity<ResponseWrapper> addCustomer(@RequestBody Customer customer){
	
		Customer customerObj=this.customerService.addCustomer(customer);
		if(customerObj!=null) {
			return ResponseEntity.status(HttpStatus.OK).
					body(new ResponseWrapper(customerObj));	
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).
					body(new ResponseWrapper("Customer not saved..."));
			
		}
		
	}
	@GetMapping("/v1.0/")
	public List<Customer> getAllCustomers(){
		return this.customerService.getCustomers();
	}
	
	
	
}
