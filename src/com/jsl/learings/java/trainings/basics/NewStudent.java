package com.jsl.learings.java.trainings.basics;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class NewStudent implements StudentInterface, Comparator<NewStudent> {
	public static final int DEFAULT_NewStudent_AGE = 18;
	public static final String DEFAULT_NewStudent_NAME = "NewStudent";
	private static long idCounter;

	static {
		idCounter = 10;
	}

	private char testChar;
	private String NewStudentName;
	private int NewStudentAge;
	private long NewStudentId;
	private String result;
	private RESULT NewStudentResult;

	NewStudent() {
		this(generateRandomNewStudent(), DEFAULT_NewStudent_AGE);
	}

	NewStudent(String name) {
		this(name, 18);
	}

	NewStudent(String name, int age) {
		this.NewStudentName = name;
		this.NewStudentAge = age;
		this.NewStudentId = idCounter;
		idCounter++;
	}

	private static String generateRandomNewStudent() {
		final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return UUID.randomUUID().toString();
	}

	public String getNewStudentName() {
		return NewStudentName;
	}

	public void setNewStudentName(String NewStudentName) {
		this.NewStudentName = NewStudentName;
	}

	public int getNewStudentAge() {
		return NewStudentAge;
	}

	public void setNewStudentAge(int NewStudentAge) {
		this.NewStudentAge = NewStudentAge;
	}

	public long getNewStudentId() {
		return NewStudentId;
	}

	public void setNewStudentId(long NewStudentId) {
		this.NewStudentId = NewStudentId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public StudentInterface.RESULT getNewStudentResult() {
		return NewStudentResult;
	}

	public void setNewStudentResult(StudentInterface.RESULT NewStudentResult) {
		this.NewStudentResult = NewStudentResult;
	}

	public char getTestChar() {
		return testChar;
	}

	public void setTestChar(char testChar) {
		this.testChar = testChar;
	}

	@Override
	public int compare(NewStudent o1, NewStudent o2) {
		return o1.getNewStudentAge() < o2.getNewStudentAge() ? -1 : o1.getNewStudentAge() == o2.getNewStudentAge() ? 0 : 1;
//		return Integer.compare(o1.getNewStudentAge(), o2.getNewStudentAge());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NewStudent NewStudent = (NewStudent) o;
//		return NewStudentAge == NewStudent.NewStudentAge && NewStudentName.equals(NewStudent.NewStudentName);
		return NewStudentId == NewStudent.NewStudentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NewStudentName, NewStudentAge, NewStudentId, result, NewStudentResult);
	}

	@Override
	public String toString() {
		return "NewStudent{" +
				"NewStudentName='" + NewStudentName + '\'' +
				", NewStudentAge=" + NewStudentAge +
				", NewStudentId=" + NewStudentId +
				", result='" + result + '\'' +
				", NewStudentResult=" + NewStudentResult +
				'}';
	}

	public void setExaminationResult(int marks) {
		if (marks > 40) {
			this.setResult("PASS");
			this.setNewStudentResult(StudentInterface.RESULT.PASS);
		} else if (marks >= 35) {
			this.setResult("PROMOTED");
			this.setNewStudentResult(StudentInterface.RESULT.PROMOTED);
		} else {
			this.setResult("FAIL");
			this.setNewStudentResult(StudentInterface.RESULT.FAIL);
		}
	}
}
