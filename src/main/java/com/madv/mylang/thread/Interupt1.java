package com.madv.mylang.thread;

/**
 * Created by madv on 26.01.2017.
 */
public class Interupt1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println(Thread.currentThread().isInterrupted());
                for (int i = 0; i < 10; i++) {
                    System.err.println(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                        System.err.println(Thread.currentThread().isInterrupted()); // сбрасывает флаг прерывания
                        System.err.println("Разбудили");
                        break;
                    }
                }
                System.err.println(Thread.currentThread().isInterrupted());
            }
        });

        System.err.println("start...");
        thread.start();
        Thread.sleep(1000);
//        thread.stop(); НИКОГДА
        thread.interrupt(); // тактичный способ сказать, что пора закругляться!
        System.err.println("finish...");
    }
}
