package com.madv.mylang.patterns.my.factorymetod.sheme;
/*
* Класс создания продуктов.
* Работает с абстрактным классом Product, а не с конкретными классами продуктов
* */

public class CreatorB extends Creator {
    @Override
    Product factoryMetod() {
        Product product = new ProductB();
        product.setName("Это продукт B.");
        ((ProductB) product).setFieldB("А зто поле продукта B.");
        return product;
    };
}
