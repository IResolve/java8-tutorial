package com.iresolve.java8.lambda3;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.iresolve.java8.lambda3.model.Employee;

public class PredicateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> persons = new ArrayList<>();

		persons.add(new Employee("MOHAMED", 30));
		persons.add(new Employee("AHMED", 25));
		persons.add(new Employee("Imen", 27));

		// We are using the new Predicate feauture but without a Lambda
		// expression , old InnerClass manner

		Predicate<Employee> pred1 = new Predicate<Employee>() {

			@Override
			public boolean test(Employee per) {
				// TODO Auto-generated method stub
				return (per.getAge() >= 26);
			}
		};

		for (Employee person : persons) {

			if (pred1.test(person)) {

				System.out.println(person);

			}

		}
	}

}
