//How to operate Stream
package com.giriraj;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo7 {
	public static void main(String[] args) {
		
		
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---MAP---");
		// Create a stream from given list
		// Get name of employees
		// Print the name of employees
		
		//1st way direct
		//employeeList.stream().forEach((Employee e)-> System.out.println(e.getName()));
		
		//2nd way
	     employeeList.stream()
	    .map((Employee e)-> e.getName())
	    .forEach((String  s1)->System.out.println(s1));
	     
	     
	     System.out.println("---FLAT MAP---");
			// Create a stream from multiple lists
			// Get name of employees
			// Print the name of employees
			List<Employee> employeeList2 = GeneratorUtil.populateEmployees2();
			Stream<List<Employee>> stream = Stream.of(employeeList, employeeList2);
			stream.flatMap((List<Employee> list) -> list.stream())
			.map((Employee e)->e.getName())
			.forEach((String s1 )->System.out.println(s1));
			
			
			System.out.println("---FLAT MAP--- using method rerference");
			// Create a stream from multiple lists
			// Get name of employees
			// Print the name of employees
			List<Employee> employeeList3 = GeneratorUtil.populateEmployees2();
			Stream<List<Employee>> stream1 =  Stream.of(employeeList, employeeList3);
			stream1.flatMap(Collection::stream)
			.map(Employee::getName)
			.forEach(System.out::println);
		
	}

}