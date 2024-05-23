package com.crackTheCode.Java8.functionalInterfaceQs;

@FunctionalInterface
interface SwapNumbers {
    String swappedValues(int x, int y);
}
public class SwapVariables {
    public static void main(String[] args) {
        SwapNumbers swapNumbers = (a,b)-> {
            a = a+b;
            b = a-b;
            a = a-b;
            return "a = "+a+" b = "+b;
        };
        String result = swapNumbers.swappedValues(5,6);
        System.out.println(result);
    }
}
