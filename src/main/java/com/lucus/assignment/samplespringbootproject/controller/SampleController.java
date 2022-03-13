package com.lucus.assignment.samplespringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot Sample App!";
	}

}