package com.iresolve.java8.lambda5;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = new ArrayList<String>();

		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		strings.add("fff");

		Comparator<String> comp1 = (String o1, String o2) -> {

			return o1.compareToIgnoreCase(o2);

		};

		Collections.sort(strings, comp1);

		// Traverse with for Each

		System.out.println("Traverse with for Each");

		for (String str : strings) {

			System.out.println(str);
		}

		// Traverse with Java 8 Lambda - in just one line
		// Note the new  forEach Method added to Iterable Interface

		System.out.println("Traverse with Lambda");

		strings.forEach(str -> System.out.println(str));

		// Traverse with Iterator

		System.out.println("Traverse with Iterator");

		Iterator<String> ite = strings.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());

		}

	}

}
