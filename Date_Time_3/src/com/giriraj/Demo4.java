package com.giriraj;

import java.time.LocalDate;

public class Demo4 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		//Add years
		LocalDate currentDatePlusYears = currentDate.plusYears(10);
		System.out.println("Current Date Plus Years: " + currentDatePlusYears);

		//Add months
		LocalDate currentDatePlusMonths = currentDate.plusMonths(10);
		System.out.println("Current Date Plus Months: " + currentDatePlusMonths);

		//Add weeks
		LocalDate currentDatePlusWeeks = currentDate.plusWeeks(10);
		System.out.println("Current Date Plus Weeks: " + currentDatePlusWeeks);

		//Add days
		LocalDate currentDatePlusDays = currentDate.plusDays(10);
		System.out.println("Current Date Plus Days: " + currentDatePlusDays);
	}

	
}
