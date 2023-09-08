package com.hsbc.ecommerceappv1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hsbc.ecommerceappv1.models.Customer;

@Controller
public class HomeController {
	//url handler
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("customer", new Customer());
		//view page redirection
		return "home.html";
	}
    @PostMapping("/register")
	public String register(@ModelAttribute("customer") Customer customer) {
		
    	if(customer.getFirstName()!=null)
    		return "success.html";
    	else
    		return "redirect:/home";
	}
	
}
