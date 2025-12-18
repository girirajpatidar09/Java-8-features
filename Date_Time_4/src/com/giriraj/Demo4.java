package com.giriraj;

import java.time.LocalTime;

public class Demo4 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		//Add hours
		LocalTime currentTimePlusHours = currentTime.plusHours(10);
		System.out.println("Current Time Plus Hours: " + currentTimePlusHours);

		//Add minutes
		LocalTime currentTimePlusMinutes = currentTime.plusMinutes(10);
		System.out.println("Current Time Plus Minutes: " + currentTimePlusMinutes);

		//Add seconds
		LocalTime currentTimePlusSeconds = currentTime.plusSeconds(10);
		System.out.println("Current Time Plus Seconds: " + currentTimePlusSeconds);

		//Add nanoSeconds
		LocalTime currentTimePlusNanos = currentTime.plusNanos(10);
		System.out.println("Current Time Plus Nanos: " + currentTimePlusNanos);
	}
	

	
}
