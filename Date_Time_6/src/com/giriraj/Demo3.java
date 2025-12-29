package com.giriraj;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Demo3 {
	public static void main(String[] args) {
		OffsetDateTime currentOffsetDateTime = OffsetDateTime.now(ZoneOffset.UTC);
		System.out.println("Current OffsetDateTime: " + currentOffsetDateTime);

		/*
		 * Convert currentOffsetDateTime to LocalDateTime and save in localDateTime variable
		 * Print localDateTime
		 */
		LocalDateTime localDateTime = currentOffsetDateTime.toLocalDateTime();
		System.out.println("Current OffsetLocalDateTime: " + localDateTime);
		
		/*
		 * Create an instance of LocalDateTime and save in currentLocalDateTime variable 
		 * Print the currentLocalDateTime and see if its same as localDateTime
		 */
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		System.out.println("Current LocalDateTime: " + currentLocalDateTime);
	}
	
}
