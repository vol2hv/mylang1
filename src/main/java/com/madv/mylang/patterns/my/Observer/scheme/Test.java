package com.madv.mylang.patterns.my.Observer.scheme;


import com.madv.mylang.patterns.my.Prototype.scheme.ConcretePrototype1;
import com.madv.mylang.patterns.my.Prototype.scheme.ConcretePrototype2;
import com.madv.mylang.patterns.my.Prototype.scheme.Prototype;
import lombok.extern.log4j.Log4j2;

import java.util.Random;

@Log4j2
public class Test {
    public static void main(String[] args){
        Random rnd = new Random();
        Subject subject = new ConcreteSubject();
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);

        subject.NotifyObservers(100 +rnd.nextInt(10));

        observer1.subject.RemoveObserver(observer1);
        subject.NotifyObservers(1000 +rnd.nextInt(10));
    }
}
