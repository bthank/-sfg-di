package com.binu.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.binu.springframework.sfgdi.controller.ConstructorInjectedController;
import com.binu.springframework.sfgdi.service.ConstructorInjectedGreetingServiceImpl;

@SpringBootTest
public class ContructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	
	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());
		 
		
	}
	
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

	
}
