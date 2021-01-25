package com.madv.mylang.thread.my;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1); // 1 разрешение
        CommonResource2 res = new CommonResource2();
        new Thread(new CountThread2(res, sem, "CountThread 1")).start();
        new Thread(new CountThread2(res, sem, "CountThread 2")).start();
        new Thread(new CountThread2(res, sem, "CountThread 3")).start();
    }
}

class CommonResource2{

    int x=0;
}
class CountThread2 implements Runnable{

    CommonResource2 res;
    Semaphore sem;
    String name;
    CountThread2(CommonResource2 res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){

        try{
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e) {
            String s = e.getMessage();
            System.out.println("поток прерван "+ e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}




