package com.evalueserve.iterateCollectionUsingForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterateCollectionUsingForEach {

	public static void main(String[] args) {
		List<StudentModel> list = new ArrayList<>();
		
		list.add(new StudentModel("Anuj", 10));
		list.add(new StudentModel("Aman", 20));
		list.add(new StudentModel("Ankit", 30));
	
		list.forEach((s) -> System.out.println(s));
	}
}

/*class MyConsumer implements Consumer<StudentModel> {

	@Override
	public void accept(StudentModel student) {
		System.out.println(student);
	}
}*/
