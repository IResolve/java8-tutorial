package com.iresolve.java8.lambda1;

/**
 * @author Mohamed Ben Hassine
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();

		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		strings.add("fff");
		strings.add("GGG");

		/*
		 * simple case sensitive Order
		 * 
		 * the results have been alphabetized but case matters
		 * 
		 */

		Collections.sort(strings);

		System.out.println("Simple sort by Collections Interface");

		for (String str : strings) {

			System.out.println(str);
		}

		/*
		 * Case sensitive sort with Anonymous class
		 * 
		 * the results have been alphabetized but case matters
		 * 
		 */

		Collections.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

		System.out.println("Simple sort with Anonymous class");

		for (String str : strings) {

			System.out.println(str);
		}

		/*
		 * Case sensitive sort Java 8
		 * 
		 * Implement the comparator by a lambda expression
		 * 
		 */

		Comparator<String> comp1 = (String o1, String o2) -> {

			return o1.compareTo(o2);

		};

		Collections.sort(strings, comp1);

		System.out.println("Sort with comparator implemented by a Lambda expression");

		for (String str : strings) {

			System.out.println(str);
		}

	}

}
