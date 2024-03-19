package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/listBoard")
	public void list() {	
		System.out.println("list폼작동");
	}	
}
