package com.giriraj;

import java.time.LocalDate;

public class Demo5 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		//Subtract years
		LocalDate currentDateMinusYears = currentDate.minusYears(10);
		System.out.println("Current Date Minus Years: " + currentDateMinusYears);

		//Subtract months
		LocalDate currentDateMinusMonths = currentDate.minusMonths(10);
		System.out.println("Current Date Minus Months: " + currentDateMinusMonths);

		//Subtract weeks
		LocalDate currentDateMinusWeeks = currentDate.minusWeeks(10);
		System.out.println("Current Date Minus Weeks: " + currentDateMinusWeeks);

		//Subtract days
		LocalDate currentDateMinusDays = currentDate.minusDays(10);
		System.out.println("Current Date Minus Days: " + currentDateMinusDays);
	}

	
}
