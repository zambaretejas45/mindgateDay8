package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Address address = new Address(101, "Street", "Mumbai", "MH");
		Employee employee = new Employee (101, "ABC", 1200, address);
		System.out.println(employee);
	}

}
