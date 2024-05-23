package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.*;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
		
		Stream<String> str = Stream.concat(list1.stream(), list2.stream());
		str.forEach(System.out::print);
	}
}