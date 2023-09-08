package com.hsbc.ecommerceappv1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hsbc.ecommerceappv1.models.Customer;
import com.hsbc.ecommerceappv1.repositories.CustomerRepository;

@Controller
public class HomeController {
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
}
