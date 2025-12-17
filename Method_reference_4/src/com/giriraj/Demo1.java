package com.giriraj;

import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;


public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees(10, () -> new Employee());

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}