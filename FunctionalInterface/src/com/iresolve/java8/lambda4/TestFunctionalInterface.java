package com.iresolve.java8.lambda4;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */

import com.iresolve.java8.lambda4.interfaces.InterfaceWithArgs;
import com.iresolve.java8.lambda4.interfaces.SimpleInterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		
		// Here we assign the lambda expression to a functional Interfaces

		SimpleInterface obj = () -> System.out.println("this an implementation of Interface");

		obj.doSomeJob();

		// Use of params

		InterfaceWithArgs obj2 = (val1, val2) -> {

			int result = val1 + val2;

			System.out.println("the result is :" + result);
		};

		obj2.doSomeJob(5, 12);

	}

}
