package com.giriraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList =GeneratorUtil.populatedEmployees();
		
		for(Employee employee: employeeList)
		{
			System.out.println(employee);
		}
		// Perform below tasks without using Lambda, Method Reference and Stream
				// Filter only those employees whose marks are more than equal to 60
				// Sort these employees on ascending order of their names
				// Print these employees
		
		List<Employee> filterList = new ArrayList<>();
		for(Employee e :employeeList)
		{
			if(e.getMarks()>=60)
			{
				filterList.add(e);
			}
		}
		System.out.println();
		System.out.println("Filter List names  without sortin for names:---");
		
		for(Employee e1 : filterList)
		{
			System.out.println(e1);
		}
		
		Collections.sort(filterList, new Comparator<Employee>()
				{

					@Override
					public int compare(Employee o1, Employee o2) {
						
						return o1.getName().compareTo(o2.getName());
					}
			
				}
				);
		
		
		System.out.println();
		System.out.println("Filter List names  with sorting for names:---");
		
		for(Employee e1 : filterList)
		{
			System.out.println(e1);
		}
		
	}

}