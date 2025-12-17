package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo4 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populatedEmployees();

		employeeList.forEach(System.out::println);

		// Perform below tasks using Lambda, Method Reference and Stream
				// Create stream of employees from given list
				// Filter only those employees whose marks are more than equal to 60
				// Sort these employees on ascending order of their names
				// Print these employees
		
		System.out.println();
		
		
		employeeList.stream()
		.filter((Employee employee)-> employee.getMarks()>=60)
		.sorted( (Employee o1 ,Employee o2)-> o1.getName().compareTo(o2.getName()) )
		.forEach((Employee e)->System.out.println(e));
		

		

	}

}