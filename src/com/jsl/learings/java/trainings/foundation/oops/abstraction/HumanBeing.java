package com.jsl.learings.java.trainings.foundation.oops.abstraction;

public interface HumanBeing {
	enum GENDER {
		MALE,
		FEMALE,
		OTHER
	}
	GENDER getGender();
}
