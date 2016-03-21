package com.examples.java8;

/**
 * @author Mohamed Ben Hassine
 * 2016
 */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// New Java 8 Class for formatting Date and Times

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(dtf.format(ldt));

		// Get the date format within TimeZone

		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(dtf.format(gmt));

		// Get the date format within Geographic Zone
		ZonedDateTime new_york = ZonedDateTime.now(ZoneId.of("Africa/Tunis"));
		System.out.println(dtf.format(new_york));

		// How get List of zones ID

		Set<String> zones = ZoneId.getAvailableZoneIds();

		Predicate<String> pred = str -> str.contains("Tunis");

		zones.stream().filter(pred).forEach(zone -> System.out.println(zone));

	}

}
