package com.madv.mylang.patterns.my.factorymetod.sheme;
/*
* Класс создания продуктов.
* Работает с абстрактным классом Product, а не с конкретными классами продуктов
* */

public class CreatorA extends Creator {
    @Override
    Product factoryMetod() {
        Product product = new ProductA();
        product.setName("Это продукт A.");
        ((ProductA) product).setFieldA("А зто поле продукта A.");
        return product;
    };
}
