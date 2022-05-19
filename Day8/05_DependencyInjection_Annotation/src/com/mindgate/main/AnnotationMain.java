package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);
		System.out.println("-".repeat(100));
		
		Employee employee= applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
