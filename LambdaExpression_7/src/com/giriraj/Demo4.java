package com.giriraj;

import java.util.function.BiConsumer;

public class Demo4 {

	public static void main(String ar[]) {
		BiConsumer<String, Integer> biConsumer = (language, num) -> System.out.println(" " + language + " " + num);
	biConsumer. accept("Java",17);

	}

}
