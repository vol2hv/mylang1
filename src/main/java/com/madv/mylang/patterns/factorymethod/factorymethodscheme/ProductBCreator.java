package com.madv.mylang.patterns.factorymethod.factorymethodscheme;

/**
 * Created by madv on 15.02.2017.
 */ //concrete creator
class ProductBCreator extends ProductCreator {
    @Override
    Product getProduct() {
        return new ProductB();
    }
}
