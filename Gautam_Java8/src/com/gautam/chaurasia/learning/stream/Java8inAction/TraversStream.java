package com.gautam.chaurasia.learning.stream.Java8inAction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TraversStream {

	
	public static void main(String[] args) {
		
		List<String> title = Arrays.asList("Java 8","Gautam","Learning");
		
		Stream<String> stream=title.stream();
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
	}
}
