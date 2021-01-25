package com.madv.mylang.patterns.my.strategy.scheme;

import com.madv.mylang.patterns.my.singleton.scheme.Singleton;
import lombok.extern.log4j.Log4j2;

public class Test {
    public static void main(String[] args){
        Context context = new Context(new  ConcretStrategy1());
        context.ExecuteAlgorithm();

        context = new Context(new  ConcretStrategy2());
        context.ExecuteAlgorithm();
    }
}
