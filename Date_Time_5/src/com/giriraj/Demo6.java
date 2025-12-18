package com.giriraj;

import java.time.LocalDateTime;

public class Demo6 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime);

		//Subtract years
		LocalDateTime currentDateTimeMinusYears = currentDateTime.minusYears(10);
		System.out.println("Current DateTime Minus Years: " + currentDateTimeMinusYears);

		//Subtract months
		LocalDateTime currentDateTimeMinusMonths = currentDateTime.minusMonths(10);
		System.out.println("Current DateTime Minus Months: " + currentDateTimeMinusMonths);

		//Subtract weeks
		LocalDateTime currentDateTimeMinusWeeks = currentDateTime.minusWeeks(10);
		System.out.println("Current DateTime Minus Weeks: " + currentDateTimeMinusWeeks);

		//Subtract days
		LocalDateTime currentDateTimeMinusDays = currentDateTime.minusDays(10);
		System.out.println("Current DateTime Minus Days: " + currentDateTimeMinusDays);

		//Subtract hours
		LocalDateTime currentDateTimeMinusHours = currentDateTime.minusHours(10);
		System.out.println("Current DateTime Minus Hours: " + currentDateTimeMinusHours);

		//Subtract minutes
		LocalDateTime currentDateTimeMinusMinutes = currentDateTime.minusMinutes(10);
		System.out.println("Current DateTime Minus Minutes: " + currentDateTimeMinusMinutes);

		//Subtract seconds
		LocalDateTime currentDateTimeMinusSeconds = currentDateTime.minusSeconds(10);
		System.out.println("Current DateTime Minus Seconds: " + currentDateTimeMinusSeconds);

		//Subtract nanoSeconds
		LocalDateTime currentDateTimeMinusNanos = currentDateTime.minusNanos(10);
		System.out.println("Current DateTime Minus Nanos: " + currentDateTimeMinusNanos);
	}
	

	
}
