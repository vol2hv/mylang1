/**
 * Синхронизация через Wait Notify
 */

package com.madv.mylang.thread.my;

import static com.madv.mylang.auxiliary.UtilAdv.printfPlus;

public class Wait {
    static final Object key = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            printfPlus("Поток стартовал.\n");
            for (int i = 0; i < 10; i++) {
                printfPlus("Итерация %d.\n", i);
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
            printfPlus("Поток завершился.\n");
        });

        printfPlus("Поток стартовал.\n");

        thread.start();
        synchronized (key) {
            key.wait(); // отдает ключ! IllegalMonitorStateException
        }
        printfPlus("Поток завершился.\n");
    }
}
