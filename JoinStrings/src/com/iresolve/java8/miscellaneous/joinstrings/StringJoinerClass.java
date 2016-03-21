package com.iresolve.java8.miscellaneous.joinstrings;

/**
 * @author Mohamed Ben Hassine 2016
 */

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a StringJoiner

		StringJoiner sj = new StringJoiner(",", "{", "}");

		sj.setEmptyValue("Not values yet added");
		System.out.println(sj);

		sj.add("Mohamed").add("Ines").add("Foued");

		System.out.println(sj);

		// Merging StringJoiner Interfaces

		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Programmers");

		sj.merge(sj2);

		System.out.println(sj);

		// Working wit Collections

		Set<String> set = new TreeSet<>();

		set.add("Tunis");
		set.add("Sousse");
		set.add("BenGerdene");

		StringJoiner sj3 = new StringJoiner(" and ");

		set.forEach(str -> sj3.add(str));

		System.out.println(sj3);

	}

}
