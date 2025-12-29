package com.giriraj;

import java.util.List;

public class Demo8 {
	public static void main(String ar[])
	{
		//Count how many numbers in a list are greater than 50 using streams.
		System.out.println("Count number greater than  50 in a list using stream");
		List<Integer> list = List.of(10,20,50,60,70,80,90);
		long count = list.stream().filter((Integer data)-> data>=51).count();
		System.out.println(count);
		
	}

}
