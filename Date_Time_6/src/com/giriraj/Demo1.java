package com.giriraj;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * Create an instance of OffsetDateTime and save in currentDateTime variable 
		 * Print the currentDateTime
		 */
		OffsetDateTime currentDateTime = OffsetDateTime.now();
		System.out.println("Offset CurrentDateTime: " + currentDateTime);
		
		/*
		 * Create an instance of OffsetDateTime with ZoneOffset as UTC and save in currentDateTime2 variable 
		 * Print the currentDateTime2
		 */
		OffsetDateTime currentDateTime2 = OffsetDateTime.now(ZoneOffset.UTC);
		System.out.println("Offset CurrentDateTime: " + currentDateTime2);

		/*
		 * Create an instance of OffsetDateTime with ZoneOffset as maximum and save in currentDateTime3 variable 
		 * Print the currentDateTime3
		 */
		OffsetDateTime currentDateTime3 = OffsetDateTime.now(ZoneOffset.MAX);
		System.out.println("Offset CurrentDateTime: " + currentDateTime3);

		/*
		 * Create an instance of OffsetDateTime with ZoneOffset as minimum and save in currentDateTime4 variable 
		 * Print the currentDateTime4
		 */
		OffsetDateTime currentDateTime4 = OffsetDateTime.now(ZoneOffset.MIN);
		System.out.println("Offset CurrentDateTime: " + currentDateTime4);
	
	}
	}
