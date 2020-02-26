package com.evalueserve.ExceptionHandling;

import javax.management.RuntimeErrorException;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		ThrowExceptionDemo throwExceptionDemo = new ThrowExceptionDemo();
		try {
			throwExceptionDemo.display();
		} catch(RuntimeException ex){
			System.out.println("Exception caught in main method");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}		
	}
	
	private void display() {
		try {
			throw new RuntimeErrorException(null, "RUNTIME EXCEPTION OCCURED");
		} catch(RuntimeException ex) {
			System.out.println("Exception caught in catch block of display method");
			throw ex;
		}
	}

}
