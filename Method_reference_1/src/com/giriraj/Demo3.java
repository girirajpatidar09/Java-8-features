
package com.giriraj;

import java.util.Collections;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.CustomComparator;
import com.giriraj.utility.GeneratorUtil;


public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		

		//Converting Demo2 code to method reference
		System.out.println("Sort by name:");
		Collections.sort(employeeList,CustomComparator::compareByName);
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
        System.out.println();
		System.out.println("Sort by marks:");
		Collections.sort(employeeList,  CustomComparator::compareByMarks);
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
