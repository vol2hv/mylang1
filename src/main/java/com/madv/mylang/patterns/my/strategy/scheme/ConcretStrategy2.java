package com.madv.mylang.patterns.my.strategy.scheme;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConcretStrategy2 implements Strategy {
    @Override
    public void Algorithm() {
        log.info("Реализация алгоритма конкретной стратегии 2.");
    }
}
