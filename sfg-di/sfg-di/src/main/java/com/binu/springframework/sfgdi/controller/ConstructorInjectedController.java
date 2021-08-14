package com.binu.springframework.sfgdi.controller;

import com.binu.springframework.sfgdi.service.GreetingService;

public class ConstructorInjectedController {

	GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	
	
	
}
