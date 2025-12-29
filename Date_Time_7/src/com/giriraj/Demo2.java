package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * Rename currentDateTime as birthDateTime 
		 * Set your dateTimeOfBirth in same
		 */
		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);
		System.out.println("Birth DateTime: " + birthDateTime);

		ZonedDateTime birthDateTime1 = ZonedDateTime.of(birthDateTime, ZoneId.of("UTC"));
		System.out.println("Birth DateTime: " + birthDateTime1);

		ZonedDateTime birthDateTime2 = ZonedDateTime.of(birthDate, birthTime, ZoneId.of("UTC"));
		System.out.println("Birth DateTime: " + birthDateTime2);

		ZonedDateTime birthDateTime3 = ZonedDateTime.of(1995, 11, 28, 10, 10, 10, 10, ZoneId.of("UTC"));
		System.out.println("Birth DateTime: " + birthDateTime3);
	}
	
}
