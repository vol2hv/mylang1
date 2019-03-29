package com.madv.mylang.patterns.factorymethod.factorymethodscheme;

/**
 * Created by madv on 15.02.2017.
 */ //creator
//в абстрактном классе можно сделать процедуры по созданию продукта по умолчанию
//или какие-то общие действия
abstract class ProductCreator {
    // !!! центральный метод схемы возвращает созданный прощукт
    abstract Product getProduct();
}
