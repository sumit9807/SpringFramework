package com.example.dependency_injection;

import com.example.dependency_injection.controller_withSpring.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// Getting object from Spring Context using Application Context object
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		//withDefault name
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());
		//withDifferentName
		MyControllerWithDifferentName controller_2 = (MyControllerWithDifferentName) ctx.getBean("controllerWithDifferentName");
		System.out.println(controller_2.sayHello());

		System.out.println("-------- Property Injected");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayHello());

		System.out.println("-------- Setter Injected");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayHello());

		System.out.println("-------- Constructor Injected");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getMyHelloService());
	}

}
