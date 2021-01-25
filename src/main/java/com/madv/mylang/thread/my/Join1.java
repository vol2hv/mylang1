package com.madv.mylang.thread.my;

public class Join1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.err.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        System.err.println("start...");
        thread.start();
        thread.join();  // Ждем смерти запущенного потока
        System.err.println("finish...");
    }
}
