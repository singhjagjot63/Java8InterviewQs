package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;

public class PrintNusStartingWith2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,62,32,412,586,12,72,7892,564789);
        list.stream().map(x->x.toString())
                .filter(x->x.endsWith("2"))
                .mapToInt(Integer::parseInt).forEach(System.out::println);
    }

}
