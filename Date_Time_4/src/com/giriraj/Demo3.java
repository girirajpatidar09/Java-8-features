package com.giriraj;

import java.time.LocalTime;

public class Demo3 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		System.out.println("Birth Time: " + birthTime);

		// Check if currentTime isAfter birthTime
		boolean isCurrentTimeAfterBirthTime = currentTime.isAfter(birthTime);
		System.out.println("isCurrentTimeAfterBirthTime: " + isCurrentTimeAfterBirthTime);

		// Check if currentTime isBefore birthTime
		boolean isCurrentTimeBeforeBirthTime = currentTime.isBefore(birthTime);
		System.out.println("isCurrentTimeBeforeBirthTime: " + isCurrentTimeBeforeBirthTime);
	}

	
}
