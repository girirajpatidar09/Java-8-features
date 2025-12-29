package com.giriraj;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo3 {
	public static void main(String[] args) {
		LocalTime givenTime = LocalTime.of(21, 9, 9);

		// Display givenTime in HH:mm:ss format
		convertLocalTimeToString(givenTime, "HH:mm:ss");
		// Display givenTime in HH:mm:ss a format
		convertLocalTimeToString(givenTime, "HH:mm:ss a");
		// Display givenTime in H:mm:ss a format
		convertLocalTimeToString(givenTime, "H:mm:ss a");
		// Display givenTime in HH:m:ss a format
		convertLocalTimeToString(givenTime, "HH:m:ss a");
		// Display givenTime in HH:mm:s a format
		convertLocalTimeToString(givenTime, "HH:mm:s a");
		// Display givenTime in hh:mm:ss format
		convertLocalTimeToString(givenTime, "h:mm:ss");
		// Display givenTime in hh:mm:ss a format
		convertLocalTimeToString(givenTime, "h:mm:ss a");
		// Display givenTime in h:mm:ss a format
		convertLocalTimeToString(givenTime, "h:mm:ss a");
	}
	
	public static void convertLocalTimeToString(LocalTime localTime, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String stringTime = localTime.format(formatter);
		System.out.println("Before: " + localTime + ", After: " + stringTime);
	}
}
