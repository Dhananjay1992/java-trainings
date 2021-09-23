package com.jsl.learings.java.trainings.foundation.oops.abstraction;

public class Teacher extends AbstractPerson {
	private boolean isDoctorate;

	public Teacher(String firstName, String lastName, boolean isDoctorate, GENDER gender) {

		super(firstName, lastName,gender);
		this.isDoctorate = isDoctorate;
	}

	@Override
	String getFullName() {
		if (isDoctorate) {
			return "Dr. " + this.firstName + " " + this.lastName;
		} else {
			return "Professor. " + this.firstName + " " + this.lastName;
		}
	}

	public boolean isDoctorate() {
		return isDoctorate;
	}

	public void setDoctorate(boolean doctorate) {
		isDoctorate = doctorate;
	}
}
