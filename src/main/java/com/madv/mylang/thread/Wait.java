package com.madv.mylang.thread;

/**
 * Created by madv on 26.01.2017.
 */
public class Wait {
    static final Object key = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.err.println(i);
                    if (i == 3) {
                        synchronized (key) {
                            key.notifyAll(); // IllegalMonitorStateException
                        }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // не забыть разбудить main!
            }
        });

        System.err.println("start...");
        thread.start();

        synchronized (key) {
            key.wait(); // отдает ключ! IllegalMonitorStateException
        }
        System.err.println("finish...");
    }
}
