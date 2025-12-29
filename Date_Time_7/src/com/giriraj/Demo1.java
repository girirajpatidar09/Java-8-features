package com.giriraj;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * Create an instance of ZonedDateTime and save in currentDateTime variable 
		 * Print the currentDateTime
		 */
		ZonedDateTime currentDateTime = ZonedDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime); 
		
		/*
		 * Create an instance of ZonedDateTime with ZoneId as system and save in currentDateTime2 variable 
		 * Print the currentDateTime2
		 */
		ZonedDateTime currentDateTime2 = ZonedDateTime.now(ZoneId.systemDefault());
		System.out.println("Current DateTime: " + currentDateTime2); 
		
		/*
		 * Create an instance of ZonedDateTime with ZoneId as UTC and save in currentDateTime3 variable 
		 * Print the currentDateTime3
		 */
		ZonedDateTime currentDateTime3 = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("Current DateTime: " + currentDateTime3); 
		
		
	}
	}
