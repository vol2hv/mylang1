package com.madv.mylang.patterns.strategy1;

/**
 * Created by madv on 15.01.2017.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
