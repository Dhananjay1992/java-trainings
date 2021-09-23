package com.jsl.learings.java.trainings.foundation.oops.inheritance;

public interface AnotherInterface {
	String NAME = "Gayatri";
	String SUR_NAME = "Joshi";

	static String getDefaultName() {
		return "Default Name G";
	}

	default String getFullName() {
		return NAME + SUR_NAME;
	}
}
