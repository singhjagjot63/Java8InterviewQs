package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.List;

public class SumOfAllNos {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,9,8,7,1,2,10,3,6);
        int res = list.stream().filter(x->x%2 == 0).reduce(0,(a,b)->a+b);
        System.out.println(res);
    }
}
