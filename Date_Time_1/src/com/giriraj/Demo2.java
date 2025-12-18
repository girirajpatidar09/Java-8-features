package com.giriraj;

import java.util.Date;
@SuppressWarnings("deprecation")

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * Rename currentDate as birthDate 
		 * Set your dateOfBirth in same
		 */
		Date birthDate = new Date();
		birthDate.setDate(28);
		birthDate.setMonth(11-1);
		birthDate.setYear(1995-1900);
		System.out.println("Birth Date: " + birthDate);
		System.out.println("Birth Date: " + displayFormattedDate(birthDate));
	}

	public static String displayFormattedDate(Date date) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		return year + "-" + month + "-" + day;
	}
}
