package com.madv.mylang.thread;

/**
 * Created by madv on 26.01.2017.
 */
public class Yield1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.err.println(Thread.currentThread().getName() + " " + i);
                    Thread.yield(); // можешь переключиться на другой поток
                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
