package com.jsl.learings.java.trainings.foundation.oops.inheritance;

public interface BaseInterface {
	String NAME = "Dhananjay";
	String SUR_NAME = "J";

	static String getDefaultName() {
		return "Default Name";
	}

	default String getFullName() {
		return NAME + SUR_NAME;
	}
}
