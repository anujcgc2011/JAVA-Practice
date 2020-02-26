package com.evalueserve.iterateMapUsingForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapUsingForEach {

	public static void main(String[] args) {
		Map<Integer,Employee> employeeMap = new HashMap<>();
		employeeMap.put(1, new Employee("ANUJ", ".com"));
		employeeMap.put(2, new Employee("AMAN", ".com"));
		
		//Traditional Approach
		Set<Entry<Integer, Employee>> employeeSet= employeeMap.entrySet();
		//Then iterate using enhance for loop or iterator
		for (Entry<Integer,Employee> entry: employeeSet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("****************************");
		
		Set<Integer> keySet = employeeMap.keySet();
		for(Integer key: keySet) {
			System.out.println(key);
			System.out.println(employeeMap.get(key));
		}
		System.out.println("***********USING FOR EACH JAVA 8******************");
		employeeMap.forEach((k,v) -> System.out.println(k + "\t"+ v));
	}

}
