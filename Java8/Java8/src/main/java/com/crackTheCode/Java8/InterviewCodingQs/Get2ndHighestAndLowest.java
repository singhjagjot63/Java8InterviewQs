package com.crackTheCode.Java8.InterviewCodingQs;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Get2ndHighestAndLowest {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,5,6,2,1,3,10,101,4,7,56);
        int secondHighest = list.stream().
                                          sorted(Collections.reverseOrder())
                                          .limit(2)
                                          .skip(1).findFirst().orElse(0);
        System.out.println(secondHighest);

        int secondSmallest = list.stream().sorted()
                .limit(2).skip(1).findFirst().orElse(0);
        System.out.println(secondSmallest);
    }
}
