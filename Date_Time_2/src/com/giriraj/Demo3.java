package com.giriraj;

import java.util.Calendar;

public class Demo3 {
	public static void main(String[] args) {
		Calendar currentDate = Calendar.getInstance();

		Calendar birthDate = Calendar.getInstance();
		birthDate.set(1995, Calendar.NOVEMBER, 28);

		System.out.println("Current Date: " + displayFormattedDate(currentDate));
		System.out.println("Birth Date: " + displayFormattedDate(birthDate));
		System.out.println("Age: " + calculatedAge(birthDate, currentDate));
	}

	public static String displayFormattedDate(Calendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		return year + "-" + month + "-" + day;
	}

	public static String calculatedAge(Calendar startDate, Calendar endDate) {
		long timeDifference = endDate.getTimeInMillis() - startDate.getTimeInMillis();

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
