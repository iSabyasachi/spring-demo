package com.spring.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@ComponentScan
@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner{
	//static AnnotationConfigApplicationContext appContext;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Vehicle vehicle;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringDemoApplication.class, args);
		/*System.out.println("In main Method");
		SpringApplication.run(SpringDemoApplication.class, args);
		appContext = new AnnotationConfigApplicationContext(SpringDemoApplication.class);
		Vehicle vehicle = appContext.getBean(Vehicle.class);
		System.out.println(vehicle.getEngineName());*/
		//appContext.close();
		
		/*BeanFactory beanFactory = new AnnotationConfigApplicationContext(SpringDemoApplication.class);
		Vehicle vehicle = beanFactory.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle.getEngineName());
		System.out.println(beanFactory.isSingleton("vehicle"));*/
		
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("{}",vehicle.getEngineName());
	}
	/*
	@PostConstruct
	public void postConstruct() {
		System.out.println("In postConstruct Method");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("In PreDestory Method");		
	}*/

}
