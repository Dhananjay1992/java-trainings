package com.jsl.learings.java.trainings.basics;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandomSpi;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Student implements StudentInterface, Comparable<Student>{
	private char testChar;
	private String studentName;
	private int studentAge;
	private long studentId;
	private static long idCounter;
	private String result;
	private RESULT studentResult;
	public static final int DEFAULT_STUDENT_AGE = 18;
	public static final String DEFAULT_STUDENT_NAME = "STUDENT";

	static {
		idCounter=10;
	}
	Student() {
		this(generateRandomStudent(),DEFAULT_STUDENT_AGE);
	}
	Student(String name) {
		this(name, DEFAULT_STUDENT_AGE);
	}
	Student(String name, int age) {
		this.studentName = name;
		this.studentAge = age;
		this.studentId = idCounter;
		idCounter++;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public StudentInterface.RESULT getStudentResult() {
		return studentResult;
	}

	public void setStudentResult(StudentInterface.RESULT studentResult) {
		this.studentResult = studentResult;
	}

	public char getTestChar() {
		return testChar;
	}

	public void setTestChar(char testChar) {
		this.testChar = testChar;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
//		return studentAge == student.studentAge && studentName.equals(student.studentName);
		return studentId == student.studentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentName, studentAge, studentId, result, studentResult);
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentName='" + studentName + '\'' +
				", studentAge=" + studentAge +
				", studentId=" + studentId +
				", result='" + result + '\'' +
				", studentResult=" + studentResult +
				'}';
	}
	public void setExaminationResult(int marks){
		if(marks > 40){
			this.setResult("PASS");
			this.setStudentResult(StudentInterface.RESULT.PASS);
		} else if(marks >=35){
			this.setResult("PROMOTED");
			this.setStudentResult(StudentInterface.RESULT.PROMOTED);
		}else {
			this.setResult("FAIL");
			this.setStudentResult(StudentInterface.RESULT.FAIL);
		}
	}
	private static String generateRandomStudent(){
		final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return UUID.randomUUID().toString();
	}

	@Override
	public int compareTo(Student o) {
		//by age
//		return Integer.compare(this.getStudentAge(), o.getStudentAge());
		//by name
		return this.getStudentName().compareTo(o.getStudentName());
	}
}
