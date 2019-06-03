package com.madv.mylang.patterns.my.singleton.scheme;

import com.madv.mylang.patterns.my.builder.sheme.Builder;
import com.madv.mylang.patterns.my.builder.sheme.ConcreteBuilder;
import com.madv.mylang.patterns.my.builder.sheme.Director;
import com.madv.mylang.patterns.my.builder.sheme.Product;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args){
       log.debug(Singleton.getInstance().toString());
        log.debug(Singleton.getInstance().toString());
    }
}
