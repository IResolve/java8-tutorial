package com.iresolve.java8.miscellaneous.joinstrings;

/**
 * @author Mohamed Ben Hassine 2016
 */

public class JoinerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java 8 new Join Method

		// First argument is the delimiter

		String names = String.join(",", "Mohamed", "Jaber", "Imen");

		System.out.println(names);

		String[] towns = { "Tunis", "Sousse", "Mahdia" };
		String statesList = String.join(",", towns);

		System.out.println(statesList);

	}

}
