package com.green.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class PracticeController {
	@GetMapping("/hi")
	public String hi() {
		return "index";
	 
  }
}

