package com.evalueserve.exceptionHandlingUsingLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 10, 20);
		// if i=0, then we will get arithmetic exception, for this we need to
		// use try catch block
		// traditional try catch block to handle exception
		/*
		 * try { integers.forEach((i) -> System.out.println(50 / i)); } catch
		 * (ArithmeticException e) { e.printStackTrace(); }
		 */
		integers.forEach((i) -> {
			try {
				System.out.println(50 / i);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		});
		//Above code is very ugly as it is not concise code. To overcome with this problem
		// we can use lambda wrapper for this
		integers.forEach(lambdaWrapper(i -> (System.out.println(50 / i))));
	}
	
	private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
		return i-> {
			try {
				consumer.accept(i);
			}catch(ArithmeticException e){
				System.out.println("Arithmetic Exception occurred");
			}
		}
	}
}