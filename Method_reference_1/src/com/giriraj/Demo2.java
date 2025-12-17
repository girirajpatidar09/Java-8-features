package com.giriraj;

import java.util.Collections;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.CustomComparator;
import com.giriraj.utility.GeneratorUtil;


public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();

		
		
		System.out.println("Sort by name:");
		// Collections.sort(employeeList,(Employee o1, Employee o2)->CustomComparator.compareByName(o1, o2)
		Collections.sort(employeeList, (o1, o2) -> CustomComparator.compareByName(o1, o2));

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println();
		System.out.println("Sort by marks:");
		Collections.sort(employeeList, (Employee o1, Employee o2) -> CustomComparator.compareByMarks(o1, o2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
