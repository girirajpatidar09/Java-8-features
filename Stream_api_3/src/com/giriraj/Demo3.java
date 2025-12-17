//How to operate Stream
package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo3 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList =GeneratorUtil.populateEmployees();
		System.out.println("---DISTINCT---");
		//Create a stream from given list
		//Filter distinct employees
		//Print the employees

		employeeList.stream().distinct().forEach((Employee e)->System.out.println(e));
		
		
		
		
	}

}