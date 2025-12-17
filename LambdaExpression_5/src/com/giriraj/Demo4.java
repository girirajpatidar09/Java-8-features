package com.giriraj;

import java.util.function.BiFunction;

public class Demo4 {

	public static void main(String ar[]) {
		
		BiFunction<Integer,Integer,Integer> biFunction =(num1,num2) -> num1+num2;
		int result = biFunction.apply(10,20);
		System.out.println(result);
		

	}

}
