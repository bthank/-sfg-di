package com.binu.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.binu.springframework.sfgdi.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyInjectedGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
	
}
