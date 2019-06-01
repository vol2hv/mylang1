package com.madv.mylang.patterns.my.factorymetod.sheme;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args) {
        Creator creator = new CreatorA();
        Product productA = creator.factoryMetod();
        creator.anOperation(productA);
        log.info(productA.getName());
        log.info(productA.toString());

        Product productB = new CreatorB().factoryMetod();
        log.info(productB.getName());
        log.info(new CreatorB().factoryMetod().toString());
    }

}
