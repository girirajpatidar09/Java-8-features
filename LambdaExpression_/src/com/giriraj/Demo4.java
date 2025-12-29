package com.giriraj;

import java.util.function.Function;

public class Demo4 {

	public static void main(String ar[]) {
		Function<Integer, Integer> function = (Integer num )-> num++;

		int result = function.apply(10);
		System.out.println(result);
	}

}
