package com.jsl.learings.java.trainings.performance;


import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class MathFunctions {
	public static void main(String[] args) {
		Instant start = Instant.now();
		for (double i = 0; i < 1000000000; i++) {
			Math.sqrt(i);
			Math.log(i);
		}
		System.out.println("Done!");
		Instant end = Instant.now();
		long microseconds = Duration.between(start, end).get(ChronoUnit.NANOS) / 1000;
		long milliseconds = Duration.between(start, end).toMillis();
		System.out.println("Time taken by function: " + microseconds + " microseconds");
		System.out.println("Time taken by function: " + milliseconds + " milliseconds");
	}
}
