package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
//        A string is given. Find the first non-repeated character.
//        Here main thing to observe is the use of LinkedHashMap.
//        This class maintains the insertion order. If it is removed the code compiles,
//        but outpu changes.
        String input = "Java articles are Awesome";
        char[] inputArray = input.toCharArray();
        Character c = input.chars().mapToObj(x->Character.toLowerCase((char) x))
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
               .entrySet().stream().filter(x->x.getValue() == 1).findFirst().get().getKey();
        System.out.println(c);


    }
}
