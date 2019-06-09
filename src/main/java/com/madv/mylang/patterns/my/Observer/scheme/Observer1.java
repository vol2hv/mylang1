package com.madv.mylang.patterns.my.Observer.scheme;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Observer1 implements Observer {
    Subject subject;
    public Observer1(Subject subject) {
        this.subject = subject;
        subject.AddObserver(this);
    }

    @Override
    public void Update(int number) {
        log.info("Наблюдатель 1 получил число {}", number);
    }
}
