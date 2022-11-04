package com.sonar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonar.api.service.MessageService;

@RestController
public class MainController {

	@Autowired
	private MessageService messageService; 
	
	@GetMapping("/api/message")
	public String getMessage() {
		String name="jack";
		return messageService.getMessage(name);
	}
}
