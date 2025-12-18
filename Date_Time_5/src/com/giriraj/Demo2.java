package com.giriraj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * Rename currentDateTime as birthDateTime 
		 * Set your dateTimeOfBirth in same
		 */
		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		LocalTime birthTime = LocalTime.of(10, 10, 10, 10);
		LocalDateTime birthDateTime1 = LocalDateTime.of(birthDate, birthTime);
		System.out.println("Birth DateTime: " + birthDateTime1);
		
		LocalDateTime birthDateTime2 = LocalDateTime.of(1995, 11, 28, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime2);
		
		LocalDateTime birthDateTime3 = LocalDateTime.of(1995, Month.NOVEMBER, 28, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime3);
		
		LocalDateTime birthDateTime4 = LocalDateTime.of(1995, 11, 28, 10, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime4);
		
		LocalDateTime birthDateTime5 = LocalDateTime.of(1995, Month.NOVEMBER, 28, 10, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime5);
		
		LocalDateTime birthDateTime6 = LocalDateTime.of(1995, 11, 28, 10, 10, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime6);
		
		LocalDateTime birthDateTime7 = LocalDateTime.of(1995, Month.NOVEMBER, 28, 10, 10, 10, 10);
		System.out.println("Birth DateTime: " + birthDateTime7);
	}
	
}
