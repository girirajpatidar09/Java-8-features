
package com.giriraj.utility;

import com.giriraj.entity.Employee;

public class CustomComparator {
	public CustomComparator() {

	}

	public int compareByName(Employee a, Employee b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByMarks(Employee a, Employee b) {
		return a.getMarks() - b.getMarks();
	}
}
