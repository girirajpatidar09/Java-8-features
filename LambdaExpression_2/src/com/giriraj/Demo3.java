package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = num -> num >= 0; // Lambda Expression for given functional interface

		boolean result = operation.isPositive(30);
		System.out.println(result);
	}

}
