// How to operate on Streams
package com.giriraj;

import java.util.List;
import java.util.Optional;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo1 {
	public static void main(String[] args) {
		
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---MIN---");
		// Create a stream from given list
		// Get the employee with minimum marks
		// Print the employee with minimum marks
		Optional<Employee> optional1 = employeeList.stream().min((employee1, employee2) -> employee1.getMarks()-employee2.getMarks());
		System.out.println(optional1);

		System.out.println("---MAX---");
		// Create a stream from given list
		// Get the employee with maximum marks
		// Print the employee with maximum marks
		Optional<Employee> optional2 = employeeList.stream().max((employee1, employee2) -> employee1.getMarks()-employee2.getMarks());
		System.out.println(optional2);
	}

}