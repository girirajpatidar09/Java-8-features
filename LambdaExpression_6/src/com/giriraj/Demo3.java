

package com.giriraj;

import com.giriraj.service.Operation;

public class Demo3 {

	public static void main(String ar[]) {
		Operation operation = (num1, num2) -> num1 > num2; 

		boolean result = operation.isGreater(10, 20);
		System.out.println(result);

	}

}



