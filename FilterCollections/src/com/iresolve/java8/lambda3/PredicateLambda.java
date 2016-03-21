package com.iresolve.java8.lambda3;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.iresolve.java8.lambda3.model.Employee;

public class PredicateLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Preparing a list or employee

		List<Employee> persons = new ArrayList<>();

		persons.add(new Employee("MOHAMED", 30));
		persons.add(new Employee("AHMED", 40));
		persons.add(new Employee("Monia", 45));

		// Old fashion prior to Java 8 to get a list of employee having an age >
		// 'FixedValue'

		System.out.println("Filtering Prior to Java 1.8 ");
		for (Employee person : persons) {
			if (person.getAge() > 41) {

				System.out.println(person);
			}

		}

		// Since Java 8 , a Predicate Class was added to contain a filtering
		// condition
		// Using Lambda Expressions

		// here we are creating to predicates for Age and Name !

		Predicate<Employee> predOlder = (pers) -> {

			return pers.getAge() >= 40;
		};

		Predicate<Employee> predName = (pers) -> {

			return pers.getName().equals("Monia");
		};

		// Our predicates will pas passed as parameter to any other application
		// logic !

		System.out.println("Applying The Age Predicate : ");
		displayPeople(persons, predOlder);

		// think to pass many Predicates as you need ..

	}

	private static void displayPeople(List<Employee> persons, Predicate<Employee> pred) {
		persons.forEach(person -> {

			if (pred.test(person)) {

				System.out.println(person);

			}

		});
	}

}
