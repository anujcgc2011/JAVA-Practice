package com.evalueserve.generics;

public class MyGeneric3<K, V> {

	private K key;
	private V value;
	
	public MyGeneric3(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
