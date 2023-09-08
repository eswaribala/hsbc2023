package com.hsbc.ecommerceapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.ecommerceapi.models.Customer;
import com.hsbc.ecommerceapi.repositories.CustomerRepository;
import com.hsbc.ecommerceapi.services.CustomerService;

@RestController
//naming convention
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	
	public ResponseEntity<> addCustomer(@RequestBody Customer customer){
	
		Customer customerObj=this.customerService.addCustomer(customer);
		if(customerObj!=null) {
			
		}
		else
		{
			
		}
		
	}
	
	
}
