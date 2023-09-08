package com.hsbc.ecommerceapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hsbc.ecommerceapi.repositories.CustomerRepository;

@Controller
public class ReportController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	

}
