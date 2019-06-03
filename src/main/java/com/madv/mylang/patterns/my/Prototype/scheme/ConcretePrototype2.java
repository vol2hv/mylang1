package com.madv.mylang.patterns.my.Prototype.scheme;

public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String type) {
        super(type);
    }
    @Override
    public Prototype Clone() {
        return new ConcretePrototype2("Клон Prototype2");
    }
}
