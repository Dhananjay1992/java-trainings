package com.jsl.learings.java.trainings.advanced.singleton;

import java.util.stream.Stream;

public class UseNonSingletonClass {
	public static void main(String[] args) {
		NonSingletonClass ns1 = new NonSingletonClass();
		NonSingletonClass ns2 = new NonSingletonClass();
		System.out.println(ns1 == ns2);
		System.out.println(ns1.equals(ns2));
		ns1.setId(15);
		System.out.println(ns1.getId());
		System.out.println(ns2.getId());
//		Stream<NonSingletonClass> nonSingletonClassStream = Stream.generate(NonSingletonClass::new).parallel().limit(1000);
		Stream<NonSingletonClass> nonSingletonClassStream = Stream.generate(NonSingletonClass::new).limit(1000);
		nonSingletonClassStream.forEach(singletonClass -> System.out.println(singletonClass.getId()));
	}
}
