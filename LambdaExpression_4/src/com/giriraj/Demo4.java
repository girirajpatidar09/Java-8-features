package com.giriraj;

import java.util.function.Supplier;

public class Demo4 {

	public static void main(String ar[]) {
		Supplier<String> supplier =() ->"giriraj";
		String s1 =supplier.get();
		System.out.println(s1);

	}

}
