package com.giriraj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo1 {
	public static void main(String ar[])
	{
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/M/yyyy");
		String s =currentDate.format(formatter);
		System.out.println(s);
		
	}
	

}
