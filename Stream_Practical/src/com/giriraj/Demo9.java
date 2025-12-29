package com.giriraj;

import java.util.List;

public class Demo9 {
	public static void main(String ar[])
	{
		//Find the average of a list of integers using streams.
		System.out.println("Average of list using Stream");
		List<Integer> list = List.of(1,2,3,4,5);
		list.stream().reduce(0,(Integer x,Integer y)-> x+y);
		
	}

}
