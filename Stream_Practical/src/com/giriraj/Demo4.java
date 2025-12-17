package com.giriraj;

import java.util.List;

public class Demo4 {
	public static void main(String ar[]) {

		System.out.println("Sort a list using Stream");
		List<Integer> numbers = List.of(5, 1, 3, 2, 4);	
		numbers.stream().sorted().forEach((Integer data)->System.out.println(data));
		

	}
}
