package com.evalueserve.client;

import java.util.ArrayList;
import java.util.List;

import com.evalueserve.defaultAndStaticMethodsInInterface.DemoInterface;
import com.evalueserve.defaultAndStaticMethodsInInterfaceImpl.DemoInterfaceImpl;
import com.evalueserve.defaultAndStaticMethodsInInterfaceModel.Student;

public class ClientExample {

	public static void main(String[] args) {

		DemoInterface demoInterface = new DemoInterfaceImpl();
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Anuj",10));
		studentList.add(new Student("Aman",10));
		
		demoInterface.sortStudents(studentList);
		for(Student student: studentList) {
			System.out.println(student.getName());
		}
	}

}
