package com.madv.mylang.patterns.my.Observer.scheme;
/**
 * интерфейс объекта за которым ведется наблюдение (издателя)
 */

public interface Subject {
    void AddObserver(Observer o);
    void RemoveObserver(Observer o);
    void NotifyObservers(int number);
}
