package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = num -> ++num; // Lambda Expression for given functional interface
		
		

		int result = operation.increament(30);
		System.out.println(result);
	}

}
