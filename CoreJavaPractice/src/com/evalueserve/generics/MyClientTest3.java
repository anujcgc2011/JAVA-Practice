package com.evalueserve.generics;

public class MyClientTest3 {

	public static void main(String[] args) {
		MyGeneric3<Integer, String> myGeneric3 = new MyGeneric3<Integer, String>(101, "s");
		System.out.println(myGeneric3.getKey()+"\t"+myGeneric3.getValue());
		
	}
}
