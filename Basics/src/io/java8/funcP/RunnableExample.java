package io.java8.funcP;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed Runnable !!");
			}

		});

		thread.run();

		Thread myLambdaThread = new Thread(() -> System.out.println("Lambda Runnable "));
		myLambdaThread.run();

	}

}
