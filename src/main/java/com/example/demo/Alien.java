package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Component
public class Alien {
	
	Alien()
	{
		System.out.println("Object created");
	}
	
	private int aid;
	private String name;
	private String tech;
	@Autowired   // Whenever there is a composition or association between two objects , we use autowired here Alien Depends on Laptop
	@Qualifier("apple")   // to refer to object created with name apple in container
	private Laptop laptop;
	
	public void show()
	{
		System.out.println("Show");
		laptop.compile();
	}

}