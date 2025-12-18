package com.giriraj;

import java.util.Date;
@SuppressWarnings("deprecation")
public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Create an instance of Date and save in currentDate variable 
		 * Print the currentDate 
		 * Print the currentDate in yyyy-MM-dd format
		 */
		Date currentDate = new Date();
		System.out.println("Current Date: " + currentDate);
		System.out.println("Current Date: " + displayFormattedDate(currentDate));
	}
	
	public static String displayFormattedDate(Date date) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		return year + "-" + month + "-" + day;
	}
}
