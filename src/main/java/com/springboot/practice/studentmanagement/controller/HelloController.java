package com.springboot.practice.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model)
	{
		model.addAttribute("name", "Spring Boot Practive");
		return "hello";
	}
}
