package com.jsl.learings.java.trainings.advanced.threads;

public class ThreadWithRunnable implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId());
			System.out.println(Thread.currentThread().getThreadGroup());
			System.out.println(Thread.currentThread().getName());

		} catch (Exception e) {

		}
	}
}
