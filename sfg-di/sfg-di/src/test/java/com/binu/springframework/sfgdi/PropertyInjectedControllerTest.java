package com.binu.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.binu.springframework.sfgdi.controller.PropertyInjectedController;
import com.binu.springframework.sfgdi.service.GreetingServiceImpl;

@SpringBootTest
public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		// mimic what Spring would do to inject dependency
		controller.greetingService = new GreetingServiceImpl();
		
	}
	
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

	
}
