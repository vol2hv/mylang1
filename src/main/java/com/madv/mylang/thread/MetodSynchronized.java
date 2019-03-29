package com.madv.mylang.thread;
// синхронизируем захватываем метод целиком

/**
 * Created by madv on 25.01.2017.
 */
public class MetodSynchronized {
    static int money = 100;

    synchronized static void getMoney(int amount) { // принцип WC
        if (amount <= money) {
            pause();    // не даем процессам быстро завершиться
            money -= amount;
            System.err.println("ALL OK. New amount: " + money);
        } else {
            System.err.println("Not enough money");
        }
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mikki");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Leopold");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Bob");
                getMoney(50);
            }
        }).start();
    }
}
