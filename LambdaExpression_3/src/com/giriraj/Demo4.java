package com.giriraj;

import java.util.function.Consumer;

public class Demo4 {

	public static void main(String ar[]) {
		Consumer<Integer> consumer= num->System.out.println("Given number is "+num);
		
		consumer.accept(10);

	}

}
