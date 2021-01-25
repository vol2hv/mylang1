package com.madv.mylang.patterns.my.builder.sheme;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.Construct();
        Product product = builder.GetResult();
        log.debug(product.getParts().toString());
    }
}
