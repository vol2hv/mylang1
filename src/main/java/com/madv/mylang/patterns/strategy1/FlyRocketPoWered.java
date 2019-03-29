package com.madv.mylang.patterns.strategy1;

/**
 * Created by madv on 15.01.2017.
 */
public class FlyRocketPoWered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
