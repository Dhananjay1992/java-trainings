package com.jsl.learings.java.trainings.advanced.singleton;

import java.util.stream.Stream;

public class UseSingletonClass {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println(s1==s2);
		s1.setId(15);
		System.out.println(s1.getId());
		System.out.println(s2.getId());
		Stream<SingletonClass> singletonClassStream = Stream.generate(SingletonClass::getInstance).limit(1000);
//		Stream<SingletonClass> singletonClassStream = Stream.generate(SingletonClass::getInstance).parallel().limit(1000);
		singletonClassStream.forEach(singletonClass -> System.out.println(singletonClass.getId()));
	}
}
