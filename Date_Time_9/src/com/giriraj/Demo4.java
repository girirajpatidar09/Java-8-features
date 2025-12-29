package com.giriraj;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo4 {
	public static void main(String[] args) {
		// Convert givenTime in HH:mm:ss format to LocalTime
		convertStringToLocalTime("21:09:09", "HH:mm:ss");
		// Convert givenTime in HH:mm:ss a format to LocalTime
		convertStringToLocalTime("21:09:09 pm", "HH:mm:ss a");
		// Convert givenTime in HH:m:ss a format to LocalTime
		convertStringToLocalTime("21:9:09 pm", "HH:m:ss a");
		// Convert givenTime in HH:mm:s a format to LocalTime
		convertStringToLocalTime("21:09:9 pm", "HH:mm:s a");
		// Convert givenTime in HH:mm:ss format to LocalTime
		convertStringToLocalTime("09:09:09", "HH:mm:ss");
		// Convert givenTime in hh:mm:ss a format to LocalTime
		convertStringToLocalTime("09:09:09 pm", "hh:mm:ss a");
		// Convert givenTime in h:mm:ss a format to LocalTime
		convertStringToLocalTime("9:09:09 pm", "h:mm:ss a");
	}

	public static void convertStringToLocalTime(String stringTime, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalTime localTime = LocalTime.parse(stringTime, formatter);
		System.out.println("Before: " + stringTime + ", After: " + localTime);
	}
	

}