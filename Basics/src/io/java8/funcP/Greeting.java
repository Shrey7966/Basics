package io.java8.funcP;

public class Greeting {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();

		System.out.println("OOP Way of -");
		GreetingInterfaceIMPL gi = new GreetingInterfaceIMPL();
		greeting.greeter(gi);
		// gi.perform();
		System.out.println("*******************");

		System.out.println("Functional Programming way -");
		GreetingInterface lambdaGreeting = () -> System.out.println("Hello Shreyas!!!");
		/*
		 * MyLambda myLambdaExpression = ()->System.out.println("Hello Shreyas!!!");
		 */
		System.out.println("*******************");

		/*
		 * MyAdd addFunction = (int a, int b) -> a + b;
		 */

	}

	public void greeter(GreetingInterface greetingInterface) {
		greetingInterface.perform();
	}

}

/*
 * interface MyLambda { void test(); }
 * 
 * interface MyAdd { int addition(int a, int b); }
 */