package com.giriraj;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Demo4 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();

		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);

		System.out.println("Current Date: " + currentDate);
		System.out.println("Birth Date: " + birthDate);
		System.out.println("Age: " + calculatedAge(birthDate, currentDate));
	}

	public static String calculatedAge(LocalDate startDate, LocalDate endDate) {
		// Calculate age in years
		// Calculate age in months
		// Calculate age in days
		Period period = Period.between(startDate, endDate);
		System.out.println("Period: " + period);
		return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
	}
	

}