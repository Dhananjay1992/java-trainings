package com.jsl.learings.java.trainings.advanced.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class FunctionalProgramming {

	public static void main(String[] args) {
//		Stream<Integer> integers = Stream.of(1,2);
		Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Double> doubles = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
//		Stream<Double> doubles = Stream.of(200.0,100.0,1.0);
//		integers.filter(i -> i % 2 ==0).forEach(System.out::println);
//		integers.map(i -> i * i).forEach(System.out::println);
//		System.out.println(integers.reduce( 0, Integer::max));
//		System.out.println(integers.reduce( 1, Integer::min));
//		System.out.println(integers.reduce(1, (a,b)-> {return a/b ; }));
//		System.out.println(doubles.reduce(1.0, (a, b) -> {
//			return b / a;
//		}));
		SquareValue squared = (Double s) -> s*s;
		System.out.println(squared.square(3.0));
		integers.map(s -> squared.square(Double.parseDouble(""+ s))).forEach(System.out::println);
		doubles.map(squared::square).forEach(System.out::println);
	}
	interface SquareValue {
		Double square(Double str);
	}
}
