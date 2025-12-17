package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = (num1, num2) -> num1 + num2; // Lambda Expression for given functional interface

		int result = operation.sum(10, 20);
		System.out.println(result);

	}

}
