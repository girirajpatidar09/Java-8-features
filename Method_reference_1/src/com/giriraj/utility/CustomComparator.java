
package com.giriraj.utility;

import com.giriraj.entity.Employee;

public class CustomComparator {
	private CustomComparator() {

	}

	public static int compareByName(Employee a, Employee b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareByMarks(Employee a, Employee b) {
		return a.getMarks() - b.getMarks();
	}
}
