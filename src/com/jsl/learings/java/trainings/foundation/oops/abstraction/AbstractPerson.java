package com.jsl.learings.java.trainings.foundation.oops.abstraction;

public abstract class AbstractPerson implements HumanBeing{
	protected String firstName;
	protected String lastName;
	protected String fullName;
	protected GENDER gender;
	public AbstractPerson(String firstName, String lastName, GENDER gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	abstract String getFullName();

	String getUpperCaseNameFullName() {
		return getFullName().toUpperCase();
	}

	@Override
	public GENDER getGender() {
		return this.gender;
	}
}
