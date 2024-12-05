package com.telusko.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String welcomeMsg(){
		
		return "Welcome to our App";
	}
	
	@GetMapping("/greet")
	public String greet(){
		
		return "Hello!, Good morning";
	}
	
	
}
