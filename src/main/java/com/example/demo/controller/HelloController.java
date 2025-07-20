package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String Welcome() {
		return "Welcome...... :)";
	}
	
    @GetMapping("/test")
    public String hello() {
        return "Spring Boot App Deployed on Render Successfully!";
    }
}
