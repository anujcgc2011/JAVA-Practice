package com.evalueserve.generics;

import java.util.List;

public class MyGeneric2<T> {
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
