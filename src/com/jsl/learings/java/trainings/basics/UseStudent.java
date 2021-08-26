package com.jsl.learings.java.trainings.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStudent {
	public static void main(String[] args) {
		System.out.println("--------------creating student---------------");
		ArrayList<Student> studentArrayList = new ArrayList<>();

		Student dj = new Student("Alex", 18);
		Student alex = new Student("Dj", 17);
		Student s3 = new Student("Aaditya", 20);
		studentArrayList.add(dj);
		studentArrayList.add(alex);
		studentArrayList.add(s3);
		System.out.println(dj.equals(alex));
		//demo default toString method
		System.out.println(dj);

		// demo default values
		System.out.println(dj.getResult());
		System.out.println(dj.getStudentAge());
		System.out.println(dj.getStudentId());
		System.out.println(dj.getStudentName());
		System.out.println(dj.getStudentResult());
		System.out.println(dj.getTestChar());
		// demo examination and getters and setters
		dj.setExaminationResult(40);
		alex.setExaminationResult(34);
		System.out.println("Dhananjay result: " + dj.getResult() + " " + dj.getStudentResult());
		System.out.println("Alex result: " + alex.getResult() + " " + alex.getStudentResult());
		alex.setExaminationResult(90);
		System.out.println("Alex result: " + alex.getResult() + " " + alex.getStudentResult());

		System.out.println(dj);
		System.out.println(alex);
		System.out.println("Here are student array list..................");

		//comparable demo

		Collections.sort(studentArrayList);
		studentArrayList.forEach(System.out::println);
//		Stream<Student> studentStream = Stream.generate(Student::new).limit(10);
		Stream<Student> studentStream = Stream.generate(Student::new).limit(1000);
//		studentStream.parallel().forEach(System.out::println);
		List<Student> studentList = studentStream.parallel().collect(Collectors.toList());
		System.out.println("Here are streams student..................");
		studentList.forEach(System.out::println);

	}


}
