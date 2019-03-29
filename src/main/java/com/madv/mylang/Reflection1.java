package com.madv.mylang;

import java.util.ArrayList;
import java.util.List;

public class Reflection1 {
    public static void main(String[] args) throws ClassNotFoundException {
        String str ="Просто строка";
        Class<?> strClass=str.getClass();
        String name= strClass.getName();
        Object object = new Object();
        Class<?> objClass= object.getClass();
        List<Integer> list =new ArrayList<>();
        Class<?> listClass =list.getClass();
    }
}
