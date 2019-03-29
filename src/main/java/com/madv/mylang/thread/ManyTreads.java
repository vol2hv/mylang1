package com.madv.mylang.thread;
// работает много потоков одновременно
/**
 * Created by madv on 25.01.2017.
 */
public class ManyTreads {
    public static void main(String[] args) {
        Runnable r= () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println(Thread.currentThread() + "истекло 3 секунды " );
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.err.println(Thread.currentThread() + " " + i);
                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}

