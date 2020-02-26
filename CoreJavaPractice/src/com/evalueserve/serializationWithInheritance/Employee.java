package com.evalueserve.serializationWithInheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Serializable{

	//if subclass implements serializable interface but super class does not implement, in that case while deserializing, we will get default values of super class fields, but works fine for sub class fields.
	// to make super class fields available, need to override writeObject and readObject methods in sub class
	public Employee(int id, String name, int age) {
		super(id, name, age);
	}
	
	private static final long serialVersionUID = 6620414562244306612L;
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			//customization for super class fields to make them available for serialization.
			oos.writeInt(getId());
			oos.writeObject(getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			setId(ois.readInt());
			setName((String) ois.readObject());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Employee [email=" + email + ", password=" + password + "]";
	}
}
