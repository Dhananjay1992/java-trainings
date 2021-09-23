package com.jsl.learings.java.trainings.advanced.singleton;

import java.util.Random;

public class SingletonClass {
	private static SingletonClass instance;
	private static int counter;

	static {
		counter = 10;
	}

	private int id;

	private SingletonClass() {
		this.id = new Random().nextInt(100) + counter;
	}

	public static SingletonClass getInstance() {
		System.out.println("Inside getInstance");
		if (instance == null) {
			System.out.println("Inside getInstance first null check");
			synchronized (SingletonClass.class) {
				if (instance == null) {
					System.out.println("Inside getInstance synchronised null check");
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
