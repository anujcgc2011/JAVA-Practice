package com.evalueserve.sortingUsingComparatorUsingLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClient {

	public static void main(String[] args) {
		List<EmployeeModal> empList = new ArrayList<>();
		empList.add(new EmployeeModal("BAnuj", "a@gmail.com"));
		empList.add(new EmployeeModal("ABB", "a@gmail.com"));
		empList.add(new EmployeeModal("CCC", "a@gmail.com"));
	
		System.out.println("Before sorting:");
		empList.forEach((s) -> System.out.println(s));
		
		//TO SORT ABOVE LIST BY NAME TRADITIONAL WAY
		//Collections.sort(empList, new EmployeeNameSorter());
		
		//USING LAMBDA EXPRESSION
		Collections.sort(empList, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		
		System.out.println("After sorting:");
		empList.forEach((s) -> System.out.println(s));
		
		
	}

}
