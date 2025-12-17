//How to operate Stream
package com.giriraj;

import java.util.List;
import java.util.Optional;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo2 {
	public static void main(String[] args) {
		
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---FIND FIRST---");
		// Create a stream from given list
		// Get the first employee
		// Print the employee
		Optional<Employee> optional1 = employeeList.stream().findFirst();
		System.out.println(optional1);

		System.out.println("---FIND ANY---");
		// Create a stream from given list
		// Get any random employee
		// Print the employee
		Optional<Employee> optional2 = employeeList.stream().findAny();
		System.out.println(optional2);
		
		
	}

}