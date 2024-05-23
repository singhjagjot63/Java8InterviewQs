package com.crackTheCode.Java8.functionalInterfaceQs;

@FunctionalInterface
interface ToUpperCaseInterface {
    String makeToUpperCase(String str);
}

public class StringToUpperCase {
    public static void main(String[] args) {

        ToUpperCaseInterface toUpperCaseInterface = String::toUpperCase;

        String result = toUpperCaseInterface.makeToUpperCase("jagjot");
        System.out.println(result);
    }
}
