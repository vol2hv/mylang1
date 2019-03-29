package com.madv.mylang.patterns.observer2;

/**
 * Created by madv on 15.01.2017.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}