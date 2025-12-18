package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo4 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime);
		
		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);
		System.out.println("Birth DateTime: " + birthDateTime);
		
		// Check if currentDateTime isAfter birthDateTime
		boolean isCurrentDateTimeAfterBirthDateTime = currentDateTime.isAfter(birthDateTime);
		System.out.println("isCurrentDateTimeAfterBirthDateTime: " + isCurrentDateTimeAfterBirthDateTime);
		
		// Check if currentDateTime isBefore birthDateTime
		boolean isCurrentDateTimeBeforeBirthDateTime = currentDateTime.isBefore(birthDateTime);
		System.out.println("isCurrentDateTimeBeforeBirthDateTime: " + isCurrentDateTimeBeforeBirthDateTime);
		
		// Check if currentDateTime isEqual to birthDateTime
		boolean isCurrentDateTimeEqualBirthDateTime = currentDateTime.isEqual(birthDateTime);
		System.out.println("isCurrentDateTimeEqualBirthDateTime: " + isCurrentDateTimeEqualBirthDateTime);
	}
	
}
