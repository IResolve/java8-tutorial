package com.iresolve.java8.lambda2.model;

import com.iresolve.java8.lambda2.interfaces.EmployeeInterface;

public class Employee implements EmployeeInterface {

	// Private fields

	private String name;

	private int age;

	// Constructor
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
}
