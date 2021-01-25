package com.madv.mylang.patterns.my.Observer.scheme;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    public ConcreteSubject()
    {
        observers = new ArrayList<>();
    }
    @Override
    public void AddObserver(Observer observer)
    {
        observers.add(observer);
    }
    @Override
    public void RemoveObserver(Observer observer)
    {
        observers.remove(observer);
    }
    @Override
    public void NotifyObservers(int number)
    {
        for (Observer observer : observers ) {
            observer.Update(number);
        }
    }
}
