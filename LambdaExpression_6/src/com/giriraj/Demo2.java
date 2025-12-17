package com.giriraj;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) {
		Operation operation = new Operation() { // Anonymous inner class 
			@Override
			public  boolean isGreater(int num1, int num2) {
				return num1>num2;
			}
		};

		boolean result = operation.isGreater(60,20);
		System.out.println(result);
	}

}
