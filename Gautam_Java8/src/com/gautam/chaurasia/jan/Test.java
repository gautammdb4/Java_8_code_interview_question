package com.gautam.chaurasia.jan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import java.util.stream.Collectors;
import java.util.stream.IntStream;

//1). WAP to count the occurrence of each character in a String?
public class Test {

	
	private static void checkOccurence(String s) {
		
		Map<Character , Integer> charMap = new HashMap<>();
		
		for(char c : s.toCharArray())
		{
			charMap.put(c, charMap.getOrDefault(c, 0)+1);
		}
		
//		System.out.println(charMap);
		
		// using JAVA 8
		  
		IntStream chars = s.chars();
		Map<Character, Long> freuencyMap = chars.mapToObj(c-> (char) c).
				collect(Collectors.groupingBy(c-> c, Collectors.counting()));
		
		freuencyMap.forEach((k, v) ->System.out.println(k+" --->"+v));
		
		
		
		//----------------------------------------------------------------------//
		
		 List<String> stringList = Arrays.asList("hello", "world", "java");

	        Map<Character, Integer> frequencyMap = new HashMap<>();
	        
	        // Use streams to process each string in the list and update the frequency map
	        stringList.stream()
	            .flatMapToInt(String::chars)  // Flatten the list of strings to a stream of char codes
	            .mapToObj(c -> (char) c)  // Convert int to Character
	            .forEach(c -> frequencyMap.compute(c, (key, value) -> value == null ? 1 : value + 1));

	        // Print the frequency map
	        frequencyMap.forEach((k, v) -> System.out.println(k + " ---> " + v));
	}
	
	public static void main(String[] args) {
		
		String  s ="gautam" ;
		
		checkOccurence(s);
		
	}

	
	
	
}
