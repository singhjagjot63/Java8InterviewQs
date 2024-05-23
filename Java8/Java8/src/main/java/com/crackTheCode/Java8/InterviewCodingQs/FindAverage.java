package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,5,6,2,1,3,10,101,4,7,56);
        OptionalDouble i = list.stream().mapToInt(x -> x.intValue()).average();
        System.out.println(i);
    }
}
