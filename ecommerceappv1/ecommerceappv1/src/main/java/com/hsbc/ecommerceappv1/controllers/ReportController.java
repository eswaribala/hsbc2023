package com.hsbc.ecommerceappv1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hsbc.ecommerceappv1.repositories.CustomerRepository;

@Controller
public class ReportController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public String showAllCustomers(Model model) {
	
		model.addAttribute("customers", customerRepository.getCustomers());
		return "reports.html";
	}
	

}
