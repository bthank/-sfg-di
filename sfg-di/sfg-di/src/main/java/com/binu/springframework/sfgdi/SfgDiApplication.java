package com.binu.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.binu.springframework.sfgdi.controller.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		
		// ask the Spring Application Context for an instance of MyController class
		MyController myController = (MyController) context.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
