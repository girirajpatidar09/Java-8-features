package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * Rename currentDateTime as birthDateTime 
		 * Set your dateTimeOfBirth in same
		 */
		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);

		OffsetDateTime birthDateTime1 = OffsetDateTime.of(birthDateTime, ZoneOffset.ofHours(10));
		System.out.println("Birth DateTime: " + birthDateTime1);

		OffsetDateTime birthDateTime2 = OffsetDateTime.of(birthDateTime, ZoneOffset.ofHoursMinutes(10, 10));
		System.out.println("Birth DateTime: " + birthDateTime2);

		OffsetDateTime birthDateTime3 = OffsetDateTime.of(birthDateTime, ZoneOffset.ofHoursMinutesSeconds(10, 10, 10));
		System.out.println("Birth DateTime: " + birthDateTime3);

		OffsetDateTime birthDateTime4 = OffsetDateTime.of(birthDate, birthTime, ZoneOffset.ofHours(10));
		System.out.println("Birth DateTime: " + birthDateTime4);

		OffsetDateTime birthDateTime5 = OffsetDateTime.of(birthDate, birthTime, ZoneOffset.ofHoursMinutes(10, 10));
		System.out.println("Birth DateTime: " + birthDateTime5);

		OffsetDateTime birthDateTime6 = OffsetDateTime.of(birthDate, birthTime,
				ZoneOffset.ofHoursMinutesSeconds(10, 10, 10));
		System.out.println("Birth DateTime: " + birthDateTime6);

		OffsetDateTime birthDateTime7 = OffsetDateTime.of(1995, 11, 28, 10, 10, 10, 10, ZoneOffset.ofHours(10));
		System.out.println("Birth DateTime: " + birthDateTime7);

		OffsetDateTime birthDateTime8 = OffsetDateTime.of(1995, 11, 28, 10, 10, 10, 10,
				ZoneOffset.ofHoursMinutes(10, 10));
		System.out.println("Birth DateTime: " + birthDateTime8);

		OffsetDateTime birthDateTime9 = OffsetDateTime.of(1995, 11, 28, 10, 10, 10, 10,
				ZoneOffset.ofHoursMinutesSeconds(10, 10, 10));
		System.out.println("Birth DateTime: " + birthDateTime9);
	}
	
}
