package com.binu.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.binu.springframework.sfgdi.controller.SetterInjectedController;
import com.binu.springframework.sfgdi.service.GreetingServiceImpl;

@SpringBootTest
public class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		// mimic what Spring would do to inject dependency
		controller.setGreetingService(new GreetingServiceImpl());
		
	}
	
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

	
}
