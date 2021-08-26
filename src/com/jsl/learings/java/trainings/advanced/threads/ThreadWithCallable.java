package com.jsl.learings.java.trainings.advanced.threads;

import java.util.UUID;
import java.util.concurrent.Callable;

public class ThreadWithCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(5000);
		return UUID.randomUUID().toString();
	}
}
