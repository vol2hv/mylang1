package com.madv.mylang.proba;
class Class1 {
    private String string;

    public Class1(String string) {
        this.string = string;
    }
}
public class Test {
    public static void main(String[] args) {
        String s1 = "I have a common prefixDB";
        String s2 = "I have a common prefixCa";
        Class1 c1 = new Class1("I have a common prefixDB");
        Class1 c2 = new Class1("I have a common prefixCa");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}









