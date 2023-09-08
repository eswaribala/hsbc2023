package com.hsbc.ecommerceappv1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//url handler
	@GetMapping("/home")
	public String home() {
		//view page redirection
		return "home.html";
	}

}
