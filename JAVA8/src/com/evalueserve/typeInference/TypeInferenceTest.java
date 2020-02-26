package com.evalueserve.typeInference;

public class TypeInferenceTest {
	public static void main(String[] args) {
		// we don't need to specify data type with parameter, compiler detects automatically.
		MyComparatorInterface myComparator = (n1,n2) -> n1>n2;
		boolean compare = myComparator.compare(40, 30);
		System.out.println(compare);
	}
}
