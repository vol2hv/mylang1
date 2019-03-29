package com.madv.mylang.thread;

/**
 * Created by madv on 26.01.2017.
 */
public class Interupt2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println(Thread.currentThread().isInterrupted());
                for (int i = 0; i < 10000000; i++) {
                    System.err.println(i);
//                    if (Thread.currentThread().isInterrupted()) {
                    if (Thread.interrupted()) { // тоже проверка флага, только с его сбросом в false
                        System.err.println(Thread.currentThread().isInterrupted());
                        System.err.println("Разбудили");
                        break;
                    }
                }
                System.err.println(Thread.currentThread().isInterrupted());
            }
        });

        System.err.println("start...");
        thread.start();
        Thread.sleep(10);
        thread.interrupt(); // тактичный способ сказать, что пора закругляться!
        System.out.println("from main: " + thread.isInterrupted());
        System.err.println("finish...");
    }
}
