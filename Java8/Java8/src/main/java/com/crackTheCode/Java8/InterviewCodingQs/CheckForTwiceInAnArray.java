package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckForTwiceInAnArray {
    public static void main(String[] args) {

       // Given an integer array arr, return true if any value appears at least twice in the array, and
        // return false if every element is distinct.

        int[] arr = {5,6,2,10,1,9,0,52};
         boolean abc = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue() > 1).collect(Collectors.toList()).size() != 0 ? true : false;
        System.out.println(abc);

    }
}
