package com.binu.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.binu.springframework.sfgdi.service.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	
	// note that @Autowired is not necessary for constructor based dependency injection.  It is done automatically.
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		return greetingService.sayGreeting();
		
	}
	
	
	
	
	
}
