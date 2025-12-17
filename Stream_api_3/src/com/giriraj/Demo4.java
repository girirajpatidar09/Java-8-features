//How to operate Stream
package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo4 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---SKIP---");
		//Create a stream from given list
		//Skip first 2 employees
		//Print the employees
		employeeList.stream().skip(2).forEach(System.out::println);
		
		System.out.println("---LIMIT---");
		//Create a stream from given list
		//Get first 2 employees
		//Print the employees
		employeeList.stream().limit(2).forEach(System.out::println);
		
		
		
	}

}