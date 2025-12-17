package com.giriraj;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) {
		Operation operation = new Operation() { // Anonymous inner class that provide the implementation of Operation interface
			@Override
			public int increament(int num) {
				return ++num;
			}
		};

		int result = operation.increament(20);
		System.out.println(result);
	}

}
