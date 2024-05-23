package com.crackTheCode.Java8.functionalInterfaceQs;

@FunctionalInterface
interface MultipleThese {
    double multipliedResult(double a, double b);
}

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        MultipleThese multipleThese = (num1,num2)->num1*num2;
        Double result = multipleThese.multipliedResult(6.23,1.21);
        System.out.println(result);
    }
}
