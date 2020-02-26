package com.evalueserve.defaultAndStaticMethodsInInterface;

import java.util.Collections;
import java.util.List;

import com.evalueserve.defaultAndStaticMethodsInInterfaceModel.Student;

public interface DemoInterface {

	default public List<Student> sortStudents(List<Student> student) {
		Collections.sort(student);
		return student;
	}
	
	static public void greet(String name){
		System.out.println("Welcome:- "+name);
	}
	
	public abstract Integer getMaxNum(List<Integer> intList);
}
