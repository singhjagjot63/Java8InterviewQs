package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEventAndOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(8,84,7,4,1,2,5,10,3,36,12,11,20,56);
        Map<Boolean, Long> map = list.stream().
                collect(Collectors.groupingBy(x->x%2==0,Collectors.counting()));
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
