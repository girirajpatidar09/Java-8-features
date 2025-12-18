package com.giriraj;

import java.util.Calendar;



public class Demo2 {

	public static void main(String[] args) {
			/*
			 * Rename currentDate as birthDate 
			 * Set your dateOfBirth in same
			 */
			Calendar birthDate = Calendar.getInstance();
			birthDate.set(1995, 11-1, 28);
			System.out.println("Birth Date: " + birthDate);
			System.out.println("Birth Date: " + displayFormattedDate(birthDate));
			
			Calendar birthDate2 = Calendar.getInstance();
			birthDate2.set(1995, Calendar.NOVEMBER, 28);
			System.out.println("Birth Date: " + birthDate2);
			System.out.println("Birth Date: " + displayFormattedDate(birthDate2));
		}
	
		public static String displayFormattedDate(Calendar calendar) {
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			return year + "-" + month + "-" + day;
		}

	
}
