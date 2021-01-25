package com.madv.mylang.thread.my;

import static com.madv.mylang.auxiliary.UtilAdv.printfPlus;
import static java.lang.Math.sin;

/**
* Создание потока Thread
* Класс Thread сам реализует интерфес Runnable
* хотя его метол run() ничего не делает,
* Подкласс класса Thread может
* обеспечить собственную реализацию метода run().
*/

public class HelloThread extends Thread {
    @Override
    public void run() {
        try {

            for (int i = 0; i <5; i++) {
                System.out.println("hello from a " + getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
        }
    }

    public static void main(String[] args) {
        // метод run() запуск в том же потоке
        // метод start() запуск в новом потоке

        // определяем метод run через лямбду
        Runnable r = ()->{
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        // Главный поток запускается сам
        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.toString()); // main

        // запус потокока на основе наследования от Thread
        HelloThread helloThread = new HelloThread();
        helloThread.setName("heir");
        helloThread.start();
        // Запускаем поток через интерфейс Runnable
        new Thread(r,"MyThread").start();

        new Thread(r, "NewThread").start();
        printfPlus("Main thread finished...\n");
    }
}


