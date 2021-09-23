package com.jsl.learings.java.trainings.basics;

import java.util.Comparator;

public class NewStudentAgeComparator implements Comparator<NewStudent> {
	@Override
	public int compare(NewStudent o1, NewStudent o2) {

		return o1.getNewStudentAge() < o2.getNewStudentAge() ? -1 : o1.getNewStudentAge() == o2.getNewStudentAge() ? 0 : 1;
//		return Integer.compare(o1.getNewStudentAge(), o2.getNewStudentAge());
	}
}
