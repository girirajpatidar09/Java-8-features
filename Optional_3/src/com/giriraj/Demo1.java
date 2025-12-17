package com.giriraj;

import java.util.Optional;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo1 {
	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(67);
		System.out.println(optionalEmployee);

		/*
		 * Check if optionalEmployee is present, if yes then get employee and print its
		 * value, else print "No employee found".
		 */
		System.out.println("---IS PRESENT---");
		if (optionalEmployee.isPresent()) {
			System.out.println(optionalEmployee.get());
		} else {
			System.out.println("No employee found");
		}

		/*
		 * Check if optionalEmployee is empty, if yes then print "No employee found",
		 * else get employee and print its value.
		 */
		System.out.println("---IS EMPTY---");
		if(optionalEmployee.isEmpty())  {
			System.out.println("No employee found");
		} else {
			System.out.println(optionalEmployee.get());
		}
	}

	
}
