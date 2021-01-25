/**
 * Synchronized применяется к блоку
 */

package com.madv.mylang.thread.my;

public class SynchronizedExample1 {
    public static void main(String[] args) {
        CommonResource1 commonResource1= new CommonResource1();
        for (int i = 1; i < 6; i++){
            Thread t = new Thread(new CountThread1(commonResource1));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}
class CommonResource1{

    int x;
    synchronized void increment(){
        x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}

class CountThread1 implements Runnable{

    CommonResource1 res;
    CountThread1(CommonResource1 res){
        this.res=res;
    }

    public void run(){
        res.increment();
    }
}
