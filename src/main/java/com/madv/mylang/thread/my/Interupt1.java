package com.madv.mylang.thread.my;

import static com.madv.mylang.auxiliary.UtilAdv.printfPlus;

public class Interupt1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            printfPlus("start...\n");
//            System.err.println(Thread.currentThread().isInterrupted());
            for (int i = 0; i < 10; i++) {
                try {
                    printfPlus("Итерация %d и сон на %d ms\n", i, 200);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
//                        e.printStackTrace();
                    printfPlus("Разбудили... isInterrupted()= %b \n", Thread.currentThread().isInterrupted());
                    break;
                }
            }
            printfPlus("finish... isInterrupted()= %b \n", Thread.currentThread().isInterrupted());
        };


        printfPlus("start...\n");
        Thread thread = new Thread(r);
        thread.start();
        printfPlus("поток засыпает на %d ms\n", 1200);
        Thread.sleep(1200);
        printfPlus("Сигнал на завершение дочернего потока \n");
        thread.interrupt(); // тактичный способ сказать, что пора закругляться!
        printfPlus("finish... \n");
    }
}
