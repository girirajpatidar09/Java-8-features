package com.giriraj;

import java.time.LocalDate;
import java.time.Month;

public class Demo3 {
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		LocalDate birthDate = LocalDate.of(1995, Month.NOVEMBER, 28);
		System.out.println("Birth Date: " + birthDate);

		// Check if currentDate isAfter birthDate
		boolean isCurrentDateAfterBirthDate = currentDate.isAfter(birthDate);
		System.out.println("isCurrentDateAfterBirthDate: " + isCurrentDateAfterBirthDate);

		// Check if currentDate isBefore birthDate
		boolean isCurrentDateBeforeBirthDate = currentDate.isBefore(birthDate);
		System.out.println("isCurrentDateBeforeBirthDate: " + isCurrentDateBeforeBirthDate);

		// Check if currentDate isEqual to birthDate
		boolean isCurrentDateEqualBirthDate = currentDate.isEqual(birthDate);
		System.out.println("isCurrentDateEqualBirthDate: " + isCurrentDateEqualBirthDate);
	}

	
}
