package com.iresolve.java8.lambda4.interfaces;

/**
 * @author Mohamed Ben Hassine 2016
 */

@FunctionalInterface
public interface InterfaceWithArgs {

	/*
	 * An interface with a single abstract method. The Java API has many
	 * one-method interfaces such as Runnable, Callable, Comparator,
	 * ActionListener and others.
	 */

	// Method with Some args
	public void doSomeJob(int val1, int val2);

}
