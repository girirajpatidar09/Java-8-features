// How to calculate duration
package com.giriraj;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Demo1 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();

		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);

		System.out.println("Current Date: " + currentDate);
		System.out.println("Birth Date: " + birthDate);
		calculatedAge(birthDate, currentDate);
	}

	public static void calculatedAge(LocalDate startDate, LocalDate endDate) {
		// Calculate age in years, save and print the same
		// Calculate age in months, save and print the same
		// Calculate age in weeks, save and print the same
		// Calculate age in days, save and print the same
		long eras = ChronoUnit.ERAS.between(startDate, endDate);
		System.out.println("Age in Eras: " + eras);
		long millennia = ChronoUnit.MILLENNIA.between(startDate, endDate);
		System.out.println("Age in Millennia: " + millennia);
		long centuries = ChronoUnit.CENTURIES.between(startDate, endDate);
		System.out.println("Age in Centuries: " + centuries);
		long decades = ChronoUnit.DECADES.between(startDate, endDate);
		System.out.println("Age in Decades: " + decades);
		long years = ChronoUnit.YEARS.between(startDate, endDate);
		System.out.println("Age in Years: " + years);
		long months = ChronoUnit.MONTHS.between(startDate, endDate);
		System.out.println("Age in Months: " + months);
		long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
		System.out.println("Age in Weeks: " + weeks);
		long days = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("Age in Days: " + days);
	}
	}
