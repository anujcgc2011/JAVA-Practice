package com.evalueserve.defaultAndStaticMethodsInInterfaceModel;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
