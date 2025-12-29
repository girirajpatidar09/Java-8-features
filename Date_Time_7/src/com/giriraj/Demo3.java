package com.giriraj;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo3 {
	public static void main(String[] args) {
		
		ZonedDateTime currentZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("Current ZonedDateTime: " + currentZonedDateTime);

		/*
		 * Convert currentZonedDateTime to LocalDateTime and save in localDateTime variable
		 * Print localDateTime
		 */
		LocalDateTime localDateTime = currentZonedDateTime.toLocalDateTime();
		System.out.println("Current ZonedLocalDateTime: " + localDateTime);
		
		/*
		 * Create an instance of LocalDateTime and save in currentLocalDateTime variable 
		 * Print the currentLocalDateTime and see if its same as localDateTime
		 */
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		System.out.println("Current LocalDateTime: " + currentLocalDateTime);
		
	}
	
}
