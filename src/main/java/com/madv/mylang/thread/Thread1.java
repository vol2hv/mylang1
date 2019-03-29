package com.madv.mylang.thread;

/**
 * Created by madv on 24.01.2017.
 */
public class Thread1 {
    public static class Run1 implements Runnable {

        @Override
        public void run() {
            System.err.println("Поток заверщится через 3 секунды.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("Мужик сказал мужик сделал");
            System.err.println("Закончился поток " + Thread.currentThread());  // доступ к текущему потоку
        }
    }

    public static class Run2 extends Thread {
        @Override
        public void run() {
            System.err.println("Это наследование от чужого класса лишает нас гибкости.\n" +
                    "Лучше реализация интерфейса Runable. \n");
            System.err.println("Закончился поток " + Thread.currentThread());
        }
    }


    public static void main(String[] args) {
        // метод run() запуск в том же потоке
        // метод start() запуск в новом потоке
//        new Run2().start();
//        new Thread(new Run1()).run();
//        new Thread(new Run1()).start();
        Thread thread = new Thread(new Run1());
        thread.start();

        new Thread(new Run1()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Запуск анонимного класса");
            }
        }).start();
        new Thread(() -> System.err.println("Запускаем лямбда выражение")).start();

        Run2 r = new Run2();  // Второй способ запуска пложой
        r.start();

    }
}

