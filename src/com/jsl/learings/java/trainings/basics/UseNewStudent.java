package com.jsl.learings.java.trainings.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseNewStudent {
	public static void main(String[] args) {
		NewStudent ns1 = new NewStudent("Alex", 17);
		NewStudent ns2 = new NewStudent("Dhananjay", 20);
		NewStudent ns3 = new NewStudent("Aaditya", 19);
		NewStudent ns4 = new NewStudent("Aaamar", 19);
		ArrayList<NewStudent> newStudentArrayList = new ArrayList();
		newStudentArrayList.add(ns1);
		newStudentArrayList.add(ns2);
		newStudentArrayList.add(ns3);
		newStudentArrayList.add(ns4);
		Comparator<NewStudent> newStudentAgeComparator = Comparator.comparing(NewStudent::getNewStudentAge);
		Comparator<NewStudent> newStudentNameComparator = Comparator.comparing(NewStudent::getNewStudentName);
		Collections.sort(newStudentArrayList, newStudentAgeComparator.thenComparing(newStudentNameComparator));
//		Collections.sort(newStudentArrayList, new NewStudentAgeComparator());
		System.out.println("Printing new Student array list.............");
		System.out.println(ns1.compare(ns1, ns2));
		newStudentArrayList.forEach(System.out::println);
	}
}
