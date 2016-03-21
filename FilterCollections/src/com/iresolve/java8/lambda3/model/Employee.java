package com.iresolve.java8.lambda3.model;

/**
 * @author Mohamed Ben Hassine 2016
 */

public class Employee {

	// Private fields
	private String name;

	private int age;

	// Public Constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Overriding the ToString Method for printing Employee Details

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " (" + this.age + ")";

	}

}
