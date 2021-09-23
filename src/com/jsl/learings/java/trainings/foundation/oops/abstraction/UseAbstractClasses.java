package com.jsl.learings.java.trainings.foundation.oops.abstraction;

public class UseAbstractClasses {
	public static void main(String[] args) {
		AbstractPerson dj = new NStudent("Dhananjay", "Joshi", HumanBeing.GENDER.MALE);
		NStudent alex = new NStudent("Alex", "Klimenko",HumanBeing.GENDER.MALE);
		System.out.println(dj.getUpperCaseNameFullName());
		System.out.println(dj.getFullName());
		System.out.println(alex.getUpperCaseNameFullName());
		System.out.println(alex.getFullName());
		AbstractPerson amy = new AbstractPerson("Amy", "F",HumanBeing.GENDER.FEMALE) {
			@Override
			String getFullName() {
				return this.firstName + " : " + this.lastName;
			}
		};
		System.out.println(amy.getFullName());
		System.out.println(amy.getUpperCaseNameFullName());

		System.out.println(dj.getGender());
		System.out.println(amy.getGender());

		Teacher teacher1 = new Teacher("John", "Oldman", false, HumanBeing.GENDER.MALE);
		Teacher teacher2 = new Teacher("Filippa", "S", true, HumanBeing.GENDER.FEMALE);
		System.out.println(teacher1.getFullName());
		System.out.println(teacher2.getFullName());
		System.out.println(teacher1.getUpperCaseNameFullName());
		System.out.println(teacher2.getUpperCaseNameFullName());
		System.out.println(teacher1.getGender());
		System.out.println(teacher2.getGender());
	}
}
