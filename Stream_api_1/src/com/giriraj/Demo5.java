package com.giriraj;

import java.util.List;
import java.util.stream.Stream;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo5 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populatedEmployees();

		employeeList.forEach(System.out::println);

		// Perform below tasks using Lambda, Method Reference and Stream
				// Create stream of employees from given list
				// Filter only those employees whose marks are more than equal to 60
				// Sort these employees on ascending order of their names
				// Print these employees
		
		System.out.println();
		Stream<Employee> employeeStream= employeeList.stream();
		Stream<Employee> filterStream =employeeStream.filter((Employee employee)-> employee.getMarks()>=60);
		Stream<Employee>  sortedStream=filterStream.sorted( (Employee o1 ,Employee o2)-> o1.getName().compareTo(o2.getName()) );
		sortedStream.forEach((Employee e)->System.out.println(e));
		sortedStream.forEach((Employee e)->System.out.println(e));
		
		
		
		

		

	}

}