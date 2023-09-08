package com.hsbc.webtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String index() {
		System.out.println("Entering index");
		return "home.html";
	}
}
