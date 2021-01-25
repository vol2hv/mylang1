package com.madv.mylang.patterns.my.factory.scheme;

public class FactoryB implements AbstractFactory {
    @Override
    public AbstractProduct createProduct1(AbstractFactory factory) {
        return new ProductB1();
    }

    @Override
    public AbstractProduct createProduct2(AbstractFactory factory) {
        return new ProductB2();
    }
}
