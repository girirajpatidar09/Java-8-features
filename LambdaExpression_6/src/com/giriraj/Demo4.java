package com.giriraj;

import java.util.function.BiPredicate;

public class Demo4 {

	public static void main(String ar[]) {
		BiPredicate<Integer,Integer>  biPredicate =(num1,num2)->num1>=num2;
		boolean result = biPredicate.test(10,20); 
		System.out.println(result);

	}

}
