package com.giriraj;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) {
		Operation operation = new Operation() { // Anonymous inner class that provide the implementation of Operation
												// interface
			@Override
			public String display() {
				return "giriraj";
			}
		};

		String s1 = operation.display();
		System.out.println(s1);
	}

}
