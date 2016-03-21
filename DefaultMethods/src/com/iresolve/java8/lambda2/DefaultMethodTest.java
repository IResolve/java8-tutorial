package com.iresolve.java8.lambda2;

/**
 * @author Mohamed Ben Hassine
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.iresolve.java8.lambda2.model.Employee;

public class DefaultMethodTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("MOHAMED", 30));
		employees.add(new Employee("Aymen", 48));
		employees.add(new Employee("Imen", 27));

		// New other Java 8 feature -- (boolean-valued function) of one
		// argument.

		Predicate<Employee> pred = (p) -> p.getAge() >= 45;

		displayPeople(employees, pred);

	}

	private static void displayPeople(List<Employee> employees, Predicate<Employee> pred) {
		employees.forEach(employee -> {

			if (pred.test(employee)) {

				// String info = person.getName() + " (" + person.getAge() +
				// ")";

				// Here we use the default Method of the EmployeeInterface

				System.out.println(employee.getPersonInfo());

			}

		});
	}

}
