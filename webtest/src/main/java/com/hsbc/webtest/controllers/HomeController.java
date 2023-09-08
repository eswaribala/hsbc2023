package com.hsbc.webtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/index")
	public String index() {
		System.out.println("Entering index");
		return "index";
	}
}
