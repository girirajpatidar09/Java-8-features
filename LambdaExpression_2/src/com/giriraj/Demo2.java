package com.giriraj;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) {

		Operation operation = new Operation() {
			public boolean isPositive(int num) {
				return num >= 0;
			}

		};

		boolean result = operation.isPositive(10);
		System.out.println(result);
	}

}
