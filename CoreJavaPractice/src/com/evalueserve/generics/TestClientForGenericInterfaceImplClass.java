package com.evalueserve.generics;

public class TestClientForGenericInterfaceImplClass {

	public static void main(String[] args) {
		GenericInterfaceImplClass1<Integer> gimpl = new GenericInterfaceImplClass1<>();
		gimpl.setValue(100);
		System.out.println(gimpl.getValue());
	}

}
