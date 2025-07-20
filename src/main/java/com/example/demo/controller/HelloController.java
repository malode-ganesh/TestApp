package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/test")
	public String Welcome() {
		return "index";
	}
	
    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot App Deployed on Render Successfully!";
    }
}
