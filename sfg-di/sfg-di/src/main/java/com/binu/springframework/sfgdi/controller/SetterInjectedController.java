package com.binu.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.binu.springframework.sfgdi.service.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;

	// example of setter injection
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	
	
}
