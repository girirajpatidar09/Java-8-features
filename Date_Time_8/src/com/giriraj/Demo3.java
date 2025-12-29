package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Demo3 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();

		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);

		System.out.println("Current DateTime: " + currentDateTime);
		System.out.println("Birth DateTime: " + birthDateTime);
		calculatedAge(birthDateTime, currentDateTime);
	}

	public static void calculatedAge(LocalDateTime startDateTime, LocalDateTime endDateTime) {
		long eras = ChronoUnit.ERAS.between(startDateTime, endDateTime);
		System.out.println("Age in Eras: " + eras);
		long millennia = ChronoUnit.MILLENNIA.between(startDateTime, endDateTime);
		System.out.println("Age in Millennia: " + millennia);
		long centuries = ChronoUnit.CENTURIES.between(startDateTime, endDateTime);
		System.out.println("Age in Centuries: " + centuries);
		long decades = ChronoUnit.DECADES.between(startDateTime, endDateTime);
		System.out.println("Age in Decades: " + decades);
		long years = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		System.out.println("Age in Years: " + years);
		long months = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		System.out.println("Age in Months: " + months);
		long weeks = ChronoUnit.WEEKS.between(startDateTime, endDateTime);
		System.out.println("Age in Weeks: " + weeks);
		long days = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		System.out.println("Age in Days: " + days);
		long halfDays = ChronoUnit.HALF_DAYS.between(startDateTime, endDateTime);
		System.out.println("Age in HalfDays: " + halfDays);
		long hours = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		System.out.println("Age in Hours: " + hours);
		long minutes = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		System.out.println("Age in Minutes: " + minutes);
		long seconds = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		System.out.println("Age in Seconds: " + seconds);
		long milliSeconds = ChronoUnit.MILLIS.between(startDateTime, endDateTime);
		System.out.println("Age in MilliSeconds: " + milliSeconds);
		long microSeconds = ChronoUnit.MICROS.between(startDateTime, endDateTime);
		System.out.println("Age in MicroSeconds: " + microSeconds);
		long nanoSeconds = ChronoUnit.NANOS.between(startDateTime, endDateTime);
		System.out.println("Age in NanoSeconds: " + nanoSeconds);
	}
}
