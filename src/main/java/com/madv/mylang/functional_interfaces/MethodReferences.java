package com.madv.mylang.functional_interfaces;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings.forEach(x -> System.out.println(x));
        strings.forEach(System.out::println);
        strings.forEach(MethodReferences::staticMethod);
    }

    private static void staticMethod(String s) {
        // do something
    }
}
