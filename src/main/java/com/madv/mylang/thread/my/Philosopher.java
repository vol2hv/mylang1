package com.madv.mylang.thread.my;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

/**Семафоры отлично подходят для решения задач,
где надо ограничивать доступ.
Например, классическая задача про обедающих философов.
Ее суть: есть несколько философов, допустим, пять,
но одновременно за столом могут сидеть не более двух.
И надо, чтобы все философы пообедали,
но при этом не возникло взаимоблокировки философами друг друга в борьбе за тарелку и вилку:
 */
public class Philosopher extends Thread {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;
    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }
    @Override
    public void run()
    {
        try
        {
            while(num<3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                // философ ест
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();

                // философ гуляет
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}
