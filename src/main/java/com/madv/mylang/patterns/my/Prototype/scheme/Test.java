package com.madv.mylang.patterns.my.Prototype.scheme;


import com.madv.mylang.patterns.my.builder.sheme.Builder;
import com.madv.mylang.patterns.my.builder.sheme.ConcreteBuilder;
import com.madv.mylang.patterns.my.builder.sheme.Director;
import com.madv.mylang.patterns.my.builder.sheme.Product;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args){
        Prototype prototype = new ConcretePrototype1("Прототип для клонирования 1");
        Prototype clone = prototype.Clone();
        log.debug(clone.getType());

        prototype = new ConcretePrototype2("Прототип для клонирования 2");
        clone = prototype.Clone();
        log.debug(clone.getType());
    }
}
