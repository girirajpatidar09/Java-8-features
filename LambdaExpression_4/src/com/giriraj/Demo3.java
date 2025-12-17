package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = () -> "giriraj"; // Lambda Expression for given functional interface

		String s1 = operation.display();
		System.out.println(s1);

	}

}
