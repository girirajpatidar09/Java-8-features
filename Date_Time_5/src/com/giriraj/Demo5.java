package com.giriraj;

import java.time.LocalDateTime;

public class Demo5 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime);

		//Add years
		LocalDateTime currentDateTimePlusYears = currentDateTime.plusYears(10);
		System.out.println("Current DateTime Plus Years: " + currentDateTimePlusYears);

		//Add months
		LocalDateTime currentDateTimePlusMonths = currentDateTime.plusMonths(10);
		System.out.println("Current DateTime Plus Months: " + currentDateTimePlusMonths);

		//Add weeks
		LocalDateTime currentDateTimePlusWeeks = currentDateTime.plusWeeks(10);
		System.out.println("Current DateTime Plus Weeks: " + currentDateTimePlusWeeks);

		//Add days
		LocalDateTime currentDateTimePlusDays = currentDateTime.plusDays(10);
		System.out.println("Current DateTime Plus Days: " + currentDateTimePlusDays);

		//Add hours
		LocalDateTime currentDateTimePlusHours = currentDateTime.plusHours(10);
		System.out.println("Current DateTime Plus Hours: " + currentDateTimePlusHours);

		//Add minutes
		LocalDateTime currentDateTimePlusMinutes = currentDateTime.plusMinutes(10);
		System.out.println("Current DateTime Plus Minutes: " + currentDateTimePlusMinutes);

		//Add seconds
		LocalDateTime currentDateTimePlusSeconds = currentDateTime.plusSeconds(10);
		System.out.println("Current DateTime Plus Seconds: " + currentDateTimePlusSeconds);

		//Add nanoSeconds
		LocalDateTime currentDateTimePlusNanos = currentDateTime.plusNanos(10);
		System.out.println("Current DateTime Plus Nanos: " + currentDateTimePlusNanos);
	}

	
}
