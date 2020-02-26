package com.evalueserve.generics;

public class ClientTest {

	public static void main(String[] args) {
		MyGeneric1<Integer> obj1 = new MyGeneric1<Integer>();
		obj1.setObject(10);
		Integer i = obj1.getObject();
		System.out.println(i);
		
		MyGeneric1<String> obj2 = new MyGeneric1<String>();
		obj2.setObject("TTTTTTTTTTTTTTTTT");
		String s = obj2.getObject();
		System.out.println(s);
	}

}
