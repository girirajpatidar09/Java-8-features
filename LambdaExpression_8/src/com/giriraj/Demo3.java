package com.giriraj;

import java.io.IOException;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = (num1, num2) -> {

			if (num2 == 0)
				throw new IOException("value cannnot ve zero");

			return num1 / num2;

		}; // Lambda Expression for given functional interface
		int result=0;
		try {
			result = operation.divide(10, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);

	}

}
