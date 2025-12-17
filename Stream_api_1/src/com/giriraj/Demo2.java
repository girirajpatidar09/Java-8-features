package com.giriraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populatedEmployees();

		employeeList.forEach((Employee employee) -> System.out.println(employee));

		// Perform below tasks using Lambda but without using Method Reference and
		// Stream
		// Filter only those employees whose marks are more than equal to 60
		// Sort these employees on ascending order of their names
		// Print these employees
		List<Employee> filterList = new ArrayList<>();

		employeeList.forEach((Employee employee) -> {
			if (employee.getMarks() >= 60)
				filterList.add(employee);

		});

//		for(Employee employee : employeeList)
//		{
//			if(employee.getMarks()>=60)
//			filterList.add(employee);
//		}
//		
		Collections.sort(filterList, (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println();
		System.out.println("filerList");
		filterList.forEach((Employee employee) -> System.out.println(employee));

	}

}