package com.madv.mylang.proba;

import java.util.HashSet;
import java.util.Set;

interface T1{
    int VALUE = 1;
    void m1();
}
interface T2{
    int VALUE = 2;
    void m1();
}


class TestClass1 implements T1, T2 {
    public void m1(){
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
    }

    public static void main(String[] args) {
        new TestClass1().m1();
        T1 t1 = new TestClass1();
        T2 t2 = new TestClass1();
        t1.m1();
        t2.m1();
    }

}