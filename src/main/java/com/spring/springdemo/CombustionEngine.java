package com.spring.springdemo;

public class CombustionEngine implements Engine{
	private String name = "CombustionEngine";
	
	@Override
	public String getName() {
		return this.name;
	}
}
