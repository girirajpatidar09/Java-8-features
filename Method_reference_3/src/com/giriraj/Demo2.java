
package com.giriraj;

import java.util.Collections;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		List<String> nameList = GeneratorUtil.populateNames(employeeList);

		System.out.println("Sort by name:");
		Collections.sort(nameList, (o1, o2) -> o1.compareTo(o2));
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}
