package com.madv.mylang.patterns.strategy1;

/**
 * Created by madv on 15.01.2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPoWered());
        model.performFly();
    }
}
