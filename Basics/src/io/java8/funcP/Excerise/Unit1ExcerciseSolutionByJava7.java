package io.java8.funcP.Excerise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionByJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Shreyas", "Gangadhar", 26), new Person("Bruno", "Labrador", 7),
				new Person("Revathi", "CV", 51), new Person("Gangadhar", "S", 58), new Person("Shruthi", "G", 31));

		// Step-1 Sort List by Lastname

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// Step-2 Create a method that prints all elements in this List

		//printAll(people);

		// step-3, create a method that prints all people that have last name beggining
		// with G
		
		printLastNameStartingWithG(people);

	}

	private static void printLastNameStartingWithG(List<Person> people) {
		for (Person p : people) {
			if(p.getLastName().startsWith("G")) {
				System.out.println(p);
			}
			
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
