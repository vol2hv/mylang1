package com.madv.mylang.patterns.strategy1;

/**
 * Created by madv on 15.01.2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
