package com.evalueserve.string;

public class ClientTest2 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		// == checks the reference
		if(str1 == str2) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		if(str3 == str4) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

}
