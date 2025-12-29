package com.giriraj;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Demo2 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();

		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);

		System.out.println("Current Time: " + currentTime);
		System.out.println("Birth Time: " + birthTime);
		calculatedAge(birthTime, currentTime);
	}

	public static void calculatedAge(LocalTime startTime, LocalTime endTime) {
		// Calculate age in hours, save and print the same
		// Calculate age in minutes, save and print the same
		// Calculate age in seconds, save and print the same
		long halfDays = ChronoUnit.HALF_DAYS.between(startTime, endTime);
		System.out.println("Age in HalfDays: " + halfDays);
		long hours = ChronoUnit.HOURS.between(startTime, endTime);
		System.out.println("Age in Hours: " + hours);
		long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
		System.out.println("Age in Minutes: " + minutes);
		long seconds = ChronoUnit.SECONDS.between(startTime, endTime);
		System.out.println("Age in Seconds: " + seconds);
		long milliSeconds = ChronoUnit.MILLIS.between(startTime, endTime);
		System.out.println("Age in MilliSeconds: " + milliSeconds);
		long microSeconds = ChronoUnit.MICROS.between(startTime, endTime);
		System.out.println("Age in MicroSeconds: " + microSeconds);
		long nanoSeconds = ChronoUnit.NANOS.between(startTime, endTime);
		System.out.println("Age in NanoSeconds: " + nanoSeconds);
	}	
}
