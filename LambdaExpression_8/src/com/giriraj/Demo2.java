package com.giriraj;

import java.io.IOException;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) throws IOException {
		Operation operation = new Operation() { // Anonymous inner class 
			@Override
			public  int divide(int num1, int num2) {
			  return num1/num2;

			}
		};

	int result = operation.divide(10,0);
	System.out.println(result);
	}

}
