//How to operate Stream
package com.giriraj;

import java.util.List;
import java.util.stream.Stream;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo2 {
	public static void main(String[] args) {
		
		        //Create a stream from given list
				//Filter employees with marks more than equal to 60
				//Print the employees
				List<Employee> employeeList = GeneratorUtil.populateEmployees();
				Stream<Employee> streamEmployee = employeeList.stream();
				streamEmployee.filter((Employee e) -> e.getMarks() >= 60)
	               .forEach((Employee e)->System.out.println(e));
		
		
		
		
	}

}