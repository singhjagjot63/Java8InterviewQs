package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;
import java.util.OptionalDouble;

public class SquareFilterAndAverage {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,50,10);
        double d = list.stream().mapToInt(x->x*x)
                .filter(y->y>50)
                .map(e->e).average().getAsDouble();
        System.out.println(d);
    }
}
