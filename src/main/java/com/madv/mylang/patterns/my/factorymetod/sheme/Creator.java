package com.madv.mylang.patterns.my.factorymetod.sheme;
/*
* Класс создания продуктов.
* Работает с абстрактным классом Product, а не с конкретными классами продуктов
* */

abstract public class Creator {
    abstract Product factoryMetod();
    void anOperation (Product product) {
       product.setName(product.getName().toUpperCase());
    }
}
