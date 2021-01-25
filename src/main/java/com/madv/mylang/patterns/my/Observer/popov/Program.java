package com.madv.mylang.patterns.my.Observer.popov;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Program {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Bank bank = new Bank("ЮнитБанк", stock);
        Broker broker = new Broker("Иван Иваныч", stock);
        // имитация торгов
        stock.Market();
        // брокер прекращает наблюдать за торгами
        broker.StopTrade();
        // имитация торгов
        stock.Market();
    }
}

interface IObserver {
    void Update(Object ob);
}

interface IObservable {
    void RegisterObserver(IObserver o);

    void RemoveObserver(IObserver o);

    void NotifyObservers();
}

class Stock implements IObservable {
    StockInfo sInfo; // информация о торгах

    List<IObserver> observers;

    public Stock() {
        observers = new ArrayList<>();
        sInfo = new StockInfo();
    }

    public void RegisterObserver(IObserver o) {
        observers.add(o);
    }

    public void RemoveObserver(IObserver o) {
        observers.remove(o);
    }

    public void NotifyObservers() {
        for (IObserver ob : observers) {
            ob.Update(sInfo);
        }
    }

    public void Market() {
        Random rnd = new Random();
        sInfo.USD = 60 + rnd.nextInt(10);
        sInfo.Euro = 70 + rnd.nextInt(10);
        NotifyObservers();
    }
}


class StockInfo {
   int USD;
   int Euro;
}
@Log4j2
class Broker implements IObserver {
    private String name;
    IObservable stock;

    Broker(String name, IObservable obs) {
        this.name = name;
        stock = obs;
        stock.RegisterObserver(this);
    }

    public void Update(Object ob) {
        StockInfo sInfo = (StockInfo) ob;

        if (sInfo.USD > 65)
            log.info("Брокер {} продает доллары;  Курс доллара: {}", this.name, sInfo.USD);
        else
            log.info("Брокер {} покупает доллары;  Курс доллара: {}", this.name, sInfo.USD);
    }

    public void StopTrade() {
        stock.RemoveObserver(this);
        stock = null;
    }
}
@Log4j2
class Bank implements IObserver {
    String Name;
    IObservable stock;

    Bank(String name, IObservable obs) {
        this.Name = name;
        stock = obs;
        stock.RegisterObserver(this);
    }

    public void Update(Object ob) {
        StockInfo sInfo = (StockInfo) ob;

        if (sInfo.Euro > 75)
            log.info("Банк {} продает евро;  Курс евро: {}", this.Name, sInfo.Euro);
        else
            log.info("Банк {} покупает евро;  Курс евро: {}", this.Name, sInfo.Euro);
    }
}

