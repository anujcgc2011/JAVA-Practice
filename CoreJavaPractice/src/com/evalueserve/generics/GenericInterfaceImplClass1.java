package com.evalueserve.generics;

//Class implementing generic interface has to be generic, if not we will get compile time errors
public class GenericInterfaceImplClass1<E> implements GenericInterface<E> {

	private E e;
	@Override
	public void setValue(E e) {
		this.e = e;
	}

	@Override
	public E getValue() {
		return null;
	}

}
