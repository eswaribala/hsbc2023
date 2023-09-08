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
	
	//url handler
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("customer", new Customer());
		//view page redirection
		return "home.html";
	}
    @PostMapping("/register")
	public String register(@ModelAttribute("customer") Customer customer,
			Model model) {
		int rows=0;
    	if(customer.getFirstName()!=null)
    	{
    	    rows=customerRepository.addCustomer(customer);
    	    if(rows>0) {
    	      model.addAttribute("customerName", customer.getFirstName());	
    		  return "success.html";
    	    }
    	    else
    	      return "redirect:/home";	
    	}
    	else
    		return "redirect:/home";
	}
	
}
