package com.evalueserve.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientTest {

	public static void main(String[] args) {

		//when we deserialize an object, constructor is not getting called, object is created from the bytes.
		String fileName = "employee.txt";
		//serializeObject(fileName);
		deserializeObject(fileName);
	}

	private static void deserializeObject(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			Employee employee = (Employee) ois.readObject();
			System.out.println(employee);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void serializeObject(String fileName) {
		Address address = new Address(1,"jam","jam1","JAMMU",180012);
		Employee employee = new Employee(1,"Anuj",20,"anujcgc2011","test",address);
		
		//in order to serialize java object, we need object of ObjectOutputStream and we need to wrap OutputStream object inside ObjectOutputStream and need to call writeObject().
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			oos.writeObject(employee);
			System.out.println("Object is serialized");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
