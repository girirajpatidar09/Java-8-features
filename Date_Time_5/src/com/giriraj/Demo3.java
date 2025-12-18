package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo3 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime);

		/*
		 * Convert currentDateTime to LocalDate and save in currentDate variable 
		 * Print currentDate
		 */
		LocalDate currentDate = currentDateTime.toLocalDate();
		System.out.println("Current Date: " + currentDate);

		/*
		 * Convert currentDateTime to LocalTime and save in currentTime variable 
		 * Print currentTime
		 */
		LocalTime currentTime = currentDateTime.toLocalTime();
		System.out.println("Current Time: " + currentTime);
	}
	
}
