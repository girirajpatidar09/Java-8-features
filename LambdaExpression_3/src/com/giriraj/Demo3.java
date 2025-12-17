package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = num -> System.out.println("Given Number is  " + num); // Lambda Expression for given  functional interface

		operation.print(30);

	}

}


