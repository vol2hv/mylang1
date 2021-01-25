/**
 * Применение условий в блокировках позволяет добиться контроля над управлением доступом к потокам.
 * Условие блокировки представлет собой объект интерфейса Condition
 * из пакета java.util.concurrent.locks.
 * Применение объектов Condition во многом аналогично использованию методов
 * wait/notify/notifyAll класса Object.
 */

package com.madv.mylang.thread.my;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionalLocksExample {
    public static void main(String[] args) {

        StoreCond storeCond =new StoreCond();
        ProducerCond producerCond = new ProducerCond(storeCond);
        ConsumerCond consumerCond = new ConsumerCond(storeCond);
        new Thread(producerCond).start();
        new Thread(consumerCond).start();
    }
}
// Класс Магазин, хранящий произведенные товары
class StoreCond {
    private int product=0;
    ReentrantLock locker;
    Condition condition;

    StoreCond(){
        locker = new ReentrantLock(); // создаем блокировку
        condition = locker.newCondition(); // получаем условие, связанное с блокировкой
    }

    public void get() {

        locker.lock();
        try{
            // пока нет доступных товаров на складе, ожидаем
            while (product<1)
                condition.await();

            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);

            // сигнализируем
            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
    public void put() {

        locker.lock();
        try{
            // пока на складе 3 товара, ждем освобождения места
            while (product>=3)
                condition.await();

            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + product);
            // сигнализируем
            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
}
// класс Производитель
class ProducerCond implements Runnable{

    StoreCond storeCond;
    ProducerCond(StoreCond storeCond){
        this.storeCond = storeCond;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            storeCond.put();
        }
    }
}
// Класс Потребитель
class ConsumerCond implements Runnable{

    StoreCond storeCond;
    ConsumerCond(StoreCond storeCond){
        this.storeCond = storeCond;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            storeCond.get();
        }
    }
}
