package com.madv.mylang.patterns.my.factory.scheme;

public class FactoryA implements AbstractFactory {
    @Override
    public AbstractProduct createProduct1(AbstractFactory factory) {
        return new ProductA1();
    }

    @Override
    public AbstractProduct createProduct2(AbstractFactory factory) {
        return new ProductA2();
    }
}
