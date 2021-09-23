package com.jsl.learings.java.trainings.foundation.oops.abstraction;

public class NStudent extends AbstractPerson {
	public NStudent(String firstName, String lastName, GENDER gender) {
		super(firstName, lastName, gender);

	}

	@Override
	String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
