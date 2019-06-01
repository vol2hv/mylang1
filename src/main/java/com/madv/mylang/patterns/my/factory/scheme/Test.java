package com.madv.mylang.patterns.my.factory.scheme;
import com.madv.mylang.patterns.my.factorymetod.sheme.ProductB;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args){
        AbstractFactory fA = new FactoryA();
        AbstractFactory fB = new FactoryB();
        log.debug(fA.createProduct1(fA).getDescription());
        log.debug(fA.createProduct2(fA).getDescription());
        log.debug(fB.createProduct1(fB).getDescription());
        log.debug(fB.createProduct2(fB).getDescription());
        log.debug((ProductB1)fB.createProduct1(fB));
    }
}
