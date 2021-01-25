package com.madv.mylang.thread.my;

import static com.madv.mylang.auxiliary.UtilAdv.printfPlus;

public class Yield1 {
    public static void main(String[] args) {
        printfPlus("Поток стартовал.\n");
        Runnable runnable = ()-> {
            for (int i = 0; i < 100; i++) {
                printfPlus("Итерация %d.\n", i);
                if (i > 51 ) {
                    Thread.yield(); // можешь переключиться на другой поток
                }
            }
            printfPlus("Поток финишировал.\n");

        };
        printfPlus("Поток стартовал.\n");
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        printfPlus("Поток финишировал.\n");
    }
}
