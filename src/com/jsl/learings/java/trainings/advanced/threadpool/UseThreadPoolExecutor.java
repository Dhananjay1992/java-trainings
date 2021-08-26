package com.jsl.learings.java.trainings.advanced.threadpool;

import com.jsl.learings.java.trainings.advanced.threads.ThreadWithCallable;
import com.jsl.learings.java.trainings.advanced.threads.ThreadWithRunnable;

import java.util.concurrent.*;

public class UseThreadPoolExecutor {
	public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		ThreadPoolExecutor cachedThreadPool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		cachedThreadPool = threadPoolExecutor;
		Future<String> returnValue = cachedThreadPool.submit(new ThreadWithCallable());
		try {
			System.out.println(returnValue.get(3, TimeUnit.SECONDS));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		cachedThreadPool.submit(new ThreadWithCallable()).get();
		cachedThreadPool.submit(new ThreadWithRunnable());
		cachedThreadPool.execute(new ThreadWithRunnable());

		System.out.println("Active count: "+ cachedThreadPool.getActiveCount());
		cachedThreadPool.shutdown();
	}
}
