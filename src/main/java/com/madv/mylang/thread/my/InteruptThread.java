package com.madv.mylang.thread.my;
/**
 *  Прерывание дочернего потока
 */

import java.time.LocalTime;
import java.util.Date;

public class InteruptThread {
    public static void main(String[] args) {
        Runnable run1 = ()->  {
            int counter = 1; // счетчик циклов
            System.out.printf("Стартовал поток %2$s %1$tH:%1$tM:%1$tS.%1$tL\n",
                    new Date(),Thread.currentThread().getName());

                while (!Thread.interrupted()) {
                    System.out.printf("Поток %1$s цикл %2$s %3$tH:%3$tM:%3$tS.%3$tL\n",
                            Thread.currentThread().getName(), counter, new Date());
                    counter++;
                }
            System.out.printf("Финишировал поток %1$s %2$tH:%2$tM:%2$tS.%2$tL\n",
                    Thread.currentThread().getName(), new Date());
        };

        System.out.printf("Стартовал поток %2$s %1$tH:%1$tM:%1$tS.%1$tL\n",
               new Date(),  Thread.currentThread().getName());

        Thread thread = new Thread(run1, "First");
        thread.start();
        try {
            Thread.sleep(100);
            thread.interrupt();
            System.out.printf("Запрос не прерывание дочернего потока: " +
                    "%1$tH:%1$tM:%1$tS.%1$tL\n", new Date());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("Финишировал поток %1$s %2$tH:%2$tM:%2$tS.%2$tL\n",
                Thread.currentThread().getName(), new Date());
    }
}
