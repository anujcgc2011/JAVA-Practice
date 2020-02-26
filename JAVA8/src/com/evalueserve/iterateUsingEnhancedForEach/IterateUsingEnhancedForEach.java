package com.evalueserve.iterateUsingEnhancedForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class IterateUsingEnhancedForEach {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("Anuj");
		nameList.add("Aman");
		nameList.add("Ankit");
		
		//iterate using forEach loop using annonymous class
		/*nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});*/
		
		//iterate using forEach loop using lambda expression
		nameList.forEach((String name) -> {
			System.out.println(name);
		});
	}

}
