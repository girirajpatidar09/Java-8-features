package com.giriraj;

import java.util.Optional;

import com.giriraj.entity.Address;
import com.giriraj.entity.Employee;
import com.giriraj.utility.GeneratorUtil;

public class Demo5 {
	
	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
		System.out.println(optionalEmployee);

		/*
		 * Map address of optionalEmployee or use default address from
		 * GeneratorUtil.populateAddress() and save in optionalAddress. Print
		 * optionalAddress. Map city of optionalAddress, if exists then print value else
		 * print "No employee found".
		 */
		System.out.println("---OR---");
		Optional<Address> optionalAddress = optionalEmployee.flatMap(Employee::getAddress)
				.or(() -> Optional.of(GeneratorUtil.populateAddress()));
		System.out.println(optionalAddress);
		
		Optional<String> optionalCity = optionalAddress.map(Address::getCity);
		optionalCity.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

	
	

	
}
