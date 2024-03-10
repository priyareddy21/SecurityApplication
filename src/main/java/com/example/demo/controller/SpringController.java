package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringController {
	
	@GetMapping("/user")
	public String user() {
		return "This is user page";
		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";
		
	}
	
	@GetMapping("/public")
	public String publicMethod() {
		return "This is public page";
		
	}

}
