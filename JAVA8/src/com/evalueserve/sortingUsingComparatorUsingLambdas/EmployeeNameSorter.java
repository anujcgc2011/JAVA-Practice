package com.evalueserve.sortingUsingComparatorUsingLambdas;

import java.util.Comparator;

public class EmployeeNameSorter implements Comparator<EmployeeModal> {

	@Override
	public int compare(EmployeeModal o1, EmployeeModal o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
