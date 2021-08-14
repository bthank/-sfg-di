package com.binu.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.binu.springframework.sfgdi.controller.ConstructorInjectedController;
import com.binu.springframework.sfgdi.controller.I18nController;
import com.binu.springframework.sfgdi.controller.MyController;
import com.binu.springframework.sfgdi.controller.PropertyInjectedController;
import com.binu.springframework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		
		System.out.println("\n\n-------------- I18n  -------------");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("\n\n-------------- @Primary Bean Based Dependency Injection -------------");
		// ask the Spring Application Context for an instance of MyController class
		MyController myController = (MyController) context.getBean("myController");;
		System.out.println(myController.sayHello());
		
		System.out.println("\n\n-------------- Property Based Dependency Injection -------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		String greeting = propertyInjectedController.getGreeting();
		System.out.println(greeting);
		
		System.out.println("\n\n-------------- Setter Based Dependency Injection -------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		greeting = setterInjectedController.getGreeting();
		System.out.println(greeting);

		
		System.out.println("\n\n-------------- Constructor Based Dependency Injection -------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		greeting = constructorInjectedController.getGreeting();
		System.out.println(greeting);		
	}

}
