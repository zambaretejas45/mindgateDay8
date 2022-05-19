package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "XYZ" , 100);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface= applicationContext.getBean("employeeService", EmployeeService.class);
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		
//		if (result) {
//			System.out.println("Employee Added Succesfully");
//		} else {
//			
//			System.out.println("FAiled to add new Employee");
//		}
//		List<Employee> allEmployees= employeeServiceInterface.getAllEmployees();
//				
//				for (Employee emp : allEmployees) {
//					System.out.println(emp);
//					
//				}
//				System.out.println("-".repeat(50));
//				
//				Employee sachin = employeeServiceInterface.getEmployeeByEmployeeId(3);
//				System.out.println(sachin);
		
		Employee emp = new Employee(1, "MSDIAN", 150000);
		boolean result = employeeServiceInterface.updateEmployee(emp);
		
		if (result) {
			System.out.println("Employee Updated Succesfully");
		}
		else {
			System.out.println("Failed to Update");
		}
		
	
	}

}
