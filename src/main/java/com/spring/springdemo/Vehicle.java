package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	@Autowired
	Engine engine;
	
	/*
	Vehicle(Engine engine){
		this.engine = engine;
	}*/
	
	public String getEngineName() {
		return engine.getName();
	}
}
