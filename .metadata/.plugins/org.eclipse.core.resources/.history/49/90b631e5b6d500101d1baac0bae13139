// How to operate on Streams
package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo1 {
	public static void main(String[] args) {
		
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---COUNT---");
		// Create a stream from given list
		// Count number of employees
		// Print the number of employees
		long count = employeeList.stream().count();
		System.out.println(count);
	}

}