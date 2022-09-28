package com.jsl.learings.java.trainings.foundation.oops.inheritance;

public interface AnotherInterface {
	String NAME = "D";
	String SUR_NAME = "Jo";

	static String getDefaultName() {
		return "Default Name D";
	}

	default String getFullName() {
		return NAME + SUR_NAME;
	}
}
