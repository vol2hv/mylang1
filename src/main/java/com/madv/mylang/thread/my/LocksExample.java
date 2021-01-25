package com.madv.mylang.thread.my;

import java.util.concurrent.locks.ReentrantLock;

public class LocksExample {
    public static void main(String[] args) {

        CommonResourceLock commonResourceLock = new CommonResourceLock();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThreadLock(commonResourceLock, locker));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResourceLock {

    int x=0;
}

class CountThreadLock implements Runnable{

    CommonResourceLock res;
    ReentrantLock locker;
    CountThreadLock(CommonResourceLock res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){

        locker.lock(); // устанавливаем блокировку
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // снимаем блокировку
        }
    }
}
