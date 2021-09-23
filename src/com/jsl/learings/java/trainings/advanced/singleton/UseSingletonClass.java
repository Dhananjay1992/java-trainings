package com.jsl.learings.java.trainings.advanced.singleton;

import java.lang.reflect.Constructor;
import java.util.stream.Stream;

public class UseSingletonClass {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		SingletonClass s3;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		s1.setId(15);
		System.out.println(s1.getId());
		System.out.println(s2.getId());
//		Stream<SingletonClass> singletonClassStream = Stream.generate(SingletonClass::getInstance).limit(1);
		Stream<SingletonClass> singletonClassStream = Stream.generate(SingletonClass::getInstance).parallel().limit(1000);
		singletonClassStream.forEach(singletonClass -> System.out.println(singletonClass.getId()));

		// break singleton
		try {
			Constructor[] constructors =
					SingletonClass.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				s3 = (SingletonClass) constructor.newInstance();
				System.out.println("instance1.hashCode():- "
						+ s1.hashCode());
				System.out.println("instance2.hashCode():- "
						+ s3.hashCode());

				System.out.println(s3.getId());
				System.out.println(s3.getId());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

