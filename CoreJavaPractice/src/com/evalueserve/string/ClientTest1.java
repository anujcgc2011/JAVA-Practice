package com.evalueserve.string;

public class ClientTest1 {

	//string pool in java
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		// == checks the reference
		if(str1 == str2) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
}
