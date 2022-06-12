package com.spring.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ElectricEngine implements Engine{
	private String name = "ElectricEngine";

	@Override
	public String getName() {
		return this.name;
	}
}
