package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintDuplicateNos {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,6,23,32,23,12,236,65,12,456,654,7789,456);
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1).forEach(System.out::println);
    }
}
