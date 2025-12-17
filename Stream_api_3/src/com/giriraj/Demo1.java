// How to operate on Streams
package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo1 {
	public static void main(String[] args) {
		
		List<Employee> employeeList =GeneratorUtil.populateEmployees();
		 System.out.println("___iterate___");
		// Create a stream from given list
			// Print the employees
		 
		//employeeList.stream().forEach((Employee e)->System.out.println(e));
		employeeList.stream().forEach(System.out::println);
		
	}

}