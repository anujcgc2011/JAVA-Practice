package com.evalueserve.lambdaExpression;

public class LambdaExpressionClientTest implements Runnable{

	public static void main(String[] args) {
		//createThreadWithoutLambda();
		createThreadWithLambda();
	}

	private static void createThreadWithLambda() {
		Runnable r = () -> {System.out.println();};	
	}

	/*private static void createThreadWithoutLambda() {
		LambdaExpressionClientTest lambdaExpressionClientTest = new LambdaExpressionClientTest();
		Thread thread = new Thread(lambdaExpressionClientTest);
		thread.start();
	}*/

	@Override
	public void run() {
		System.out.println("My task is running");
	}

}