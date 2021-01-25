package com.madv.mylang.patterns.my.Prototype.scheme;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String type) {
        super(type);
    }
    @Override
    public Prototype Clone() {
        return new ConcretePrototype1("Клон Prototype1");
    }
}
