package com.madv.mylang.patterns.strategy1;

/**
 * Created by madv on 15.01.2017.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
