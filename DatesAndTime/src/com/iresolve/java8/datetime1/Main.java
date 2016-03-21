package com.iresolve.java8.datetime1;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		// Use of Java 8 new features for Data and Time
		// New Class LocalDate

		LocalDate currentDate = LocalDate.now();

		System.out.println(currentDate);

		LocalDate specificDate = LocalDate.of(1986, 06, 30);

		System.out.println(specificDate);

		// New Class LocalTime

		LocalTime localTime = LocalTime.now();

		System.out.println(localTime);

		LocalTime specificlocalTime = LocalTime.of(17, 20, 30);

		System.out.println(specificlocalTime);

		// New Class LocalDateTime

		LocalDateTime currentDT = LocalDateTime.now();

		System.out.println(currentDT);

		LocalDateTime specificDT = LocalDateTime.of(specificDate, specificlocalTime);

		System.out.println(specificDT);

	}

}
