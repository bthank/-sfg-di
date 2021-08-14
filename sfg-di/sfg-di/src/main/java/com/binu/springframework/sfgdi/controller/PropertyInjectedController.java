package com.binu.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.binu.springframework.sfgdi.service.GreetingService;

@Controller
public class PropertyInjectedController {

	public GreetingService greetingService;
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	
}
