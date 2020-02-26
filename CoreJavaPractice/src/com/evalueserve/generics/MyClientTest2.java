package com.evalueserve.generics;

import java.util.ArrayList;
import java.util.List;

public class MyClientTest2 {

	public static void main(String[] args) {
		// we can specify only class refernces as type parameter, can't use primitive types.
		MyGeneric2<Integer> myGeneric2 = new MyGeneric2<>();
		List<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(200);
		intList.add(300);
		
		myGeneric2.setList(intList);
		List<Integer> list = myGeneric2.getList();
		list.forEach(System.out::println);
	}

}
