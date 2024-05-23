package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CountCharacter {
	public static void main(String[] args) {
		String s = "string data to count each character";
		
		s.chars().mapToObj(x->Character.toLowerCase((char) x))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().forEach(x->System.out.println(x.getKey() + " " + x.getValue()));
	}
}