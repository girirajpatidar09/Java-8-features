package com.giriraj;

import java.util.Comparator;
import java.util.List;

public class Demo7 {
	public static void main(String ar[])
	{
		//Sort a list of integers in ascending and descending order using streams.
		System.out.println("Printing min and max from given list");
		System.out.println("Increasing Order");
		List<Integer> list =List.of(1,2,4,5,3);
		list.stream().sorted().forEach((Integer x)->System.out.println(x));
		
		
		System.out.println("Decreasing Order");
		list.stream().sorted(Comparator.reverseOrder()).forEach((Integer data)->System.out.println(data));
	}

}
