package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IgnoreLast5NosAndFindSum {
    public static void main(String[] args) {

        //Task is to skip the last 5 elements of the list and print the sum of the list
        List<Integer> list = List.of(9,5,6,2,1,3,10,101,4,7,56);
        int sum = IntStream.rangeClosed(1,list.size())
                        .mapToObj(i-> list.get(list.size() - i))
                                .skip(5).mapToInt(Integer::intValue)
                        .sum();
        System.out.println(sum);
    }
}
