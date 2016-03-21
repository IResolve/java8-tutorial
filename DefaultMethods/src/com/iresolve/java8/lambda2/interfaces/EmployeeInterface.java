package com.iresolve.java8.lambda2.interfaces;

/**
 * @author Mohamed Ben Hassine
 */

public interface EmployeeInterface {

	public String getName();

	public void setName(String name);

	public int getAge();

	public void setAge(int age);

	/*
	 * Since Java 8 , we could define an implemented method in an Interface
	 * Default methods have been introduced as a mechanism to extending
	 * interfaces in a backward compatible way.
	 * 
	 * Best example The JDK Iterable interface is extended by a foreach Method
	 * since java 8
	 */
	default String getPersonInfo() {

		return getName() + " (" + getAge() + ")";
	}
}
