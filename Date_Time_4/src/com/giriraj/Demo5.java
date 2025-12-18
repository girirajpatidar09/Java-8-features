package com.giriraj;

import java.time.LocalTime;

public class Demo5 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		//Subtract hours
		LocalTime currentTimeMinusHours = currentTime.minusHours(10);
		System.out.println("Current Time Minus Hours: " + currentTimeMinusHours);

		//Subtract minutes
		LocalTime currentTimeMinusMinutes = currentTime.minusMinutes(10);
		System.out.println("Current Time Minus Minutes: " + currentTimeMinusMinutes);

		//Subtract seconds
		LocalTime currentTimeMinusSeconds = currentTime.minusSeconds(10);
		System.out.println("Current Time Minus Seconds: " + currentTimeMinusSeconds);

		//Subtract nanoSeconds
		LocalTime currentTimeMinusNanos = currentTime.minusNanos(10);
		System.out.println("Current Time Minus Nanos: " + currentTimeMinusNanos);
	}

	
}
