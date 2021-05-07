package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("apple")  // Object in SPring container would be created with this name
public class Laptop {
	
	private int lid;
	private String brand;

	public void compile()
	{
		System.out.println("Compiling");
	}

} 