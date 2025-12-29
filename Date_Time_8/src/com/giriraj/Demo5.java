package com.giriraj;

import java.time.Duration;
import java.time.LocalTime;

public class Demo5 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();

		LocalTime birthTime = LocalTime.of(8, 9, 9, 9);

		System.out.println("Current Time: " + currentTime);
		System.out.println("Birth Time: " + birthTime);
		System.out.println("Age: " + calculatedAge(birthTime, currentTime));
	}

	public static String calculatedAge(LocalTime startTime, LocalTime endTime) {
		// Calculate age in hours
		// Calculate age in minutes
		// Calculate age in seconds
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Duration: " + duration);
		int hours = duration.toHoursPart();
		int minutes = duration.toMinutesPart();
		int seconds = duration.toSecondsPart();
		return hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
	}
	
}
