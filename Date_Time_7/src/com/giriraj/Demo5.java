package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Demo5 {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2023, 3, 12);
		LocalTime localTime = LocalTime.of(2, 0, 0);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("LocalDateTime: " + localDateTime);

		ZoneOffset zoneOffset = ZoneOffset.ofHours(-5);
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println("OffsetDateTime: " + offsetDateTime);

		ZoneId zoneId = ZoneId.of("America/New_York");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("ZonedDateTime: " + zonedDateTime);
	}
	
}
