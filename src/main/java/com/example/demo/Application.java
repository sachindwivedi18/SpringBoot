package com.example.demo;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Spring basically has its own container, and classes annotated with @Component are present/initializes in container from following line
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);  // Alien Bean is already created here.
		
		// So we are getting the bean/object from container from given below line
		Alien a = context.getBean(Alien.class);
		
		a.show();

//		Alien a2 = context.getBean(Alien.class);  // New object won't be created because Spring Boot by default uses singleton pattern

		// To create two Objects annotate bean class with @Scope(value="prototype") the getBean(Alien.class) will create new object when you call it		
	}
}