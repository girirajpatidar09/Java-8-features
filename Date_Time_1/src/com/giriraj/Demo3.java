package com.giriraj;

import java.util.Date;
@SuppressWarnings("deprecation")
public class Demo3 {

	public static void main(String[] args) {
		Date currentDate = new Date();

		Date birthDate = new Date();
		birthDate.setYear(95);
		birthDate.setMonth(10);
		birthDate.setDate(28);

		System.out.println("Current Date: " + displayFormattedDate(currentDate));
		System.out.println("Birth Date: " + displayFormattedDate(birthDate));
		System.out.println("Age: " + calculatedAge(birthDate, currentDate));
	}

	public static String displayFormattedDate(Date date) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		return year + "-" + month + "-" + day;
	}

	public static String calculatedAge(Date startDate, Date endDate) {
		long timeDifference = endDate.getTime() - startDate.getTime();

		long millisecondsPerYear = (long) (365.25 * 24 * 60 * 60 * 1000);
		long years = timeDifference / millisecondsPerYear;
		long remainingTime = timeDifference % millisecondsPerYear;

		long millisecondsPerMonth = 30L * 24 * 60 * 60 * 1000;
		long months = remainingTime / millisecondsPerMonth;
		remainingTime %= millisecondsPerMonth;

		long millisecondsPerDay = 24L * 60 * 60 * 1000;
		long days = remainingTime / millisecondsPerDay;

		return years + " years, " + months + " months, " + days + " days";
	}
}
