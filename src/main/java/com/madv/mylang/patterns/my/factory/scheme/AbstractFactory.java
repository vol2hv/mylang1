package com.madv.mylang.patterns.my.factory.scheme;

public interface AbstractFactory {
    AbstractProduct createProduct1 (AbstractFactory factory);
    AbstractProduct createProduct2 (AbstractFactory factory);
}
