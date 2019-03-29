package com.madv.mylang.thread;
// обмен данными между потоками

import java.io.IOException;

/**
 * Created by madv on 25.01.2017.
 */
public class DataExchange {
    public volatile static boolean flag = true;  // volatile отменяет кеширование данных в потоках

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                System.err.println("Нажмите Enter");
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            flag = false;
            System.err.println("Флаг сброшен");
        }
    }

    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            System.err.println("Ждем сброса флага...");
            while (flag){};
            System.err.println("Дождались сброса флага");
        }
    }

    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();
    }
}
