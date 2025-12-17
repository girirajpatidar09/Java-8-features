
package com.giriraj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;


public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		List<String> nameList = GeneratorUtil.populateNames(employeeList);

		System.out.println("Sort by name:");
		Collections.sort(nameList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}
