package com.jsl.learings.java.trainings.advanced.files;

import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class InstantUse {


	public static void main(String[] args) {
		Instant now = Instant.now();
		Instant yesterday = Instant.now().minus(1,ChronoUnit.DAYS);
		Instant tomorrow = Instant.now().plus(1,ChronoUnit.DAYS);
		System.out.println(now);
		System.out.println(now.minus(2, ChronoUnit.DAYS));
		System.out.println(now.minus(2, ChronoUnit.HOURS));
		System.out.println(now.plus(1, ChronoUnit.HALF_DAYS));
		System.out.println(now.atZone(ZoneId.of("Europe/Paris")));
		System.out.println(now.atZone(ZoneId.of("Asia/Kolkata")));
		System.out.println(now.isAfter(yesterday));
		System.out.println(now.isAfter(tomorrow));
	}
}
