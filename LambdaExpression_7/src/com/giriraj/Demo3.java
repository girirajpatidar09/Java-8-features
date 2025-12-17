package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = (language, version) -> System.out.println("" + language + "" + version);; // Lambda Expression for given functional interface
		operation.show("java",21);

		

	}

}
