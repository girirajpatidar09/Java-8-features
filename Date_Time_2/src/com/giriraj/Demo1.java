package com.giriraj;

import java.util.Calendar;


public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Create an instance of Calendar and save in currentDate variable 
		 * Print the currentDate 
		 * Print the currentDate in yyyy-MM-dd format
		 */
		Calendar currentDate = Calendar.getInstance();
		System.out.println("Current Date: " + currentDate);
		System.out.println("Current Date: " + displayFormattedDate(currentDate));
	}
	
	public static String displayFormattedDate(Calendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		return year + "-" + month + "-" + day;
	}
}
