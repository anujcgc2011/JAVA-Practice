package com.evalueserve.functionalInterfaceWithLambda;

public class FunctionalInterfaceClientClass {

	public static void main(String[] args) {

		//createThreadUsingAnonymousClass();
		createThreadUsingLambdaExpression();
		
		
	}

	private static void createThreadUsingLambdaExpression() {
		Runnable r = ()-> {
				System.out.println("RUN IS CALLED");
			};
		
		Thread thread = new Thread(r);
		thread.run();
	}
	
	/*private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUN IS CALLED");
			}
		};
		Thread thread = new Thread(r);
		thread.run();
	}*/

}
