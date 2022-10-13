package io.java8.funcP;

public class Greeting {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		
		//OOP way
		GreetingInterfaceIMPL gi = new GreetingInterfaceIMPL();
		// gi.perform();
		
		//Funtional Programming way
		GreetingInterface lambdaGreeting = () -> System.out.println("Hello Shreyas!!!");
		
		greeting.greeter(gi);
		// or
		// GreetingInterface myLambdaExpression = ()->System.out.println("Hello
		// Shreyas!!!");

		//MyAdd addFunction = (int a, int b) -> a + b;

	}

	public void greeter(GreetingInterface greetingInterface) {
		greetingInterface.perform();
	}

}

/*
interface MyLambda {
	void test();
}

interface MyAdd {
	int addition(int a, int b);
}
*/