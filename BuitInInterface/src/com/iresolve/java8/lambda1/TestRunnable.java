package com.iresolve.java8.lambda1;

/**
 * @author Mohamed Ben Hassine
 */


public class TestRunnable {

	public static void main(String[] args) {

		// Old way to implement Built in Interfaces Prior to java 8

		/*
		 * Runnable run1 = new Runnable() {
		 * 
		 * @Override public void run() { System.out.println(
		 * "Running Thread Number one" ); } };
		 * 
		 * Runnable run2 = new Runnable() {
		 * 
		 * @Override System.out.println("Running Number Thread two"); } };
		 */

		// Using Lambda Expression since java 8

		Runnable run1 = () -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running Thread Number one");
		};
		Runnable run2 = () -> {
			System.out.println("Running Thread Number two");
		};

		new Thread(run1).start();
		new Thread(run2).start();

	}

}
