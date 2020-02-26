package com.evalueserve.generics;

public class GenericMethodInsideGenericClass<T> {

	private T[] arr;
	
	public GenericMethodInsideGenericClass(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}
	
	public <E> void printElements(E[] arr) {
		for(E e: arr){
			System.out.println(e);
		}
	}
}
