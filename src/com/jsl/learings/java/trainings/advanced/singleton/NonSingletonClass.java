package com.jsl.learings.java.trainings.advanced.singleton;

import java.util.Random;

public class NonSingletonClass {
	private int id;
	private static int counter;

	static {
		counter = 10;
	}

	public NonSingletonClass() {
		this.id = new Random().nextInt(100)+counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
