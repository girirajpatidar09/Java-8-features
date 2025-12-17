package com.giriraj;

import java.util.function.Predicate;

public class Demo4 {

	public static void main(String ar[]) {

		
		Predicate<Integer> predicate =num-> num>=0;
		boolean result=predicate.test(10);
		System.out.println(result);
		
	}

}
