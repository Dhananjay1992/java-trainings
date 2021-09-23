package com.jsl.learings.java.trainings.advanced.singleton;

import java.util.Random;

public class NonSingletonClass {
	private static int counter;

	static {
		counter = 10;
	}

	private int id;

	public NonSingletonClass() {
		this.id = new Random().nextInt(100) + counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
