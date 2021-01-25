package com.madv.mylang.thread.my;
// синхронизируем захватываем только блок

        import static com.madv.mylang.auxiliary.UtilAdv.printfPlus;

public class BlockSynchronized {
    static int money = 100;
    static Object key = new Object();

    static void getMoney(int amount) { // принцип WC
        printfPlus("ждет освобождения общего ресурса.\n");
        synchronized (key){ // синхронизируемый блок. В качестве ключа может выступать любой Object
            if (amount <= money) {
                money -= amount;
                printfPlus("ALL OK. New amount: %d\n",money);
            } else {
                printfPlus("Not enough money. New amount: %d\n" ,money);
            }
            pause();    // не даем процессам быстро завершиться
            printfPlus("Поток завершился.\n");
        }
    }

    private static void pause() {
        try {
            printfPlus("засыпает на %d ms\n", 1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(null, ()->getMoney(49), "Mike").start();
        new Thread(null, ()->getMoney(50), "Leopold").start();
        new Thread(null, ()->getMoney(51), "Bob").start();
    }
}
