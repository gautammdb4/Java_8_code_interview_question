package com.gautam.chaurasia.jan;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//WAP to find all duplicate element  from a given String?
public class DuplicteInString {
	
	
	static void duplicate(String s)
	{
		int freqChar []  = new int[26];
		
		
		HashSet<Character> set = new HashSet<>();
		for(char c : s.toCharArray() )
		{
			if(freqChar[c-'a'] !=0)
					set.add(c);
			
			freqChar[c-'a']++;
		}
		
		System.out.println(set);
		
		
		//java 8 
		  Map<Character, Long> frencyChar = s.chars()
		  .mapToObj(c -> (char) c)
		  .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		  
		  Set<Character> duplicate_key = frencyChar.keySet().stream().filter(k -> frencyChar.get(k)>1).collect(Collectors.toSet());
		  
		  System.out.println(duplicate_key);
	}
	
	public static void main(String[] args) {
		
		
		String s ="javaprogrammingcode" ;
		
		duplicate(s);
		
	}

}
