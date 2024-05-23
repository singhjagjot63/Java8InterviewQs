package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,5,6,2,1,3,10,101,4,7,56);
        int max = list.stream().max(Comparator.comparing(Integer::intValue)).get();
        int min = list.stream().min(Comparator.comparing(Integer::intValue)).get();
        int max1 = list.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b ? a:b);
        int min1 = list.stream().reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a:b);
        System.out.println(max + " " + min + " " + max1 + " " + min1);
    }
}
