package com.giriraj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {
		// Convert givenDate in dd/MMMM/yyyy format to LocalDate
		convertStringToLocalDate("10/June/2023", "dd/MMMM/yyyy");
		// Convert givenDate in dd/MMMM/yy format to LocalDate
		convertStringToLocalDate("10/June/23", "dd/MMMM/yy");
		// Convert givenDate in dd/MMM/yyyy format to LocalDate
		convertStringToLocalDate("10/Jun/2023", "dd/MMM/yyyy");
		// Convert givenDate in dd/MM/yyyy format to LocalDate
		convertStringToLocalDate("10/06/2023", "dd/MM/yyyy");
		// Convert givenDate in dd/M/yyyy format to LocalDate
		convertStringToLocalDate("10/6/2023", "dd/M/yyyy");
		// Convert givenDate in d/MMMM/yyyy format to LocalDate
		convertStringToLocalDate("10/June/2023", "d/MMMM/yyyy");
	}

	public static void convertStringToLocalDate(String stringDate, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDate localDate = LocalDate.parse(stringDate, formatter);
		System.out.println("Before: " + stringDate + ", After: " + localDate);
	}
}
