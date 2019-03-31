package com.madv.mylang.exceptions;

import lombok.extern.log4j.Log4j2;

import java.io.*;
//java.lang.ArithmeticException: ArrayIndexOutOfBoundsException

/**
 * Created by madv on 12.01.2017.
 */
class SimpleException extends Exception {
    public SimpleException(){

    }
    public SimpleException(String s) {
        super(s);
    }
}
@Log4j2
public class Example1 {
    public static void main(String[] args) throws IOException, SimpleException {
        try {
            notHandleException();      // исключение не обрабатывается и передается для обработки вверх
        } catch (Exception e) {
            log.error("Перехыачено не обработанное исключение ", e);
        }
        processingOrder (); // порядок обработки исключения
        usefulMethods ();   // полезные методы класса исключений
        throwExeption();    // выброс существующего исключения
        myExeption();    // свое исключение
        try {
            throwReExeption();    // повторное исключение в catch
        } catch (Exception e) {
            log.error("Перехыачено не обработанное исключение ", e);
        }
        log.info("Из test7() получено {}", test7());
    }

    // исключение не обрабатывается и передается для обработки вверх
    private static void notHandleException() throws SimpleException {
        log.info("");
        throw new SimpleException("Простое но свое исключение");
    }

    private static void processingOrder (){
        int [] ar ={1,2,3,4,5};
        try{
            int a = ar[4];
            a = ar[5];
        }catch(Exception ex){
            log.info("сюда попааем только поошибке.");
            log.error("Sorry, something wrong!", ex);
        } finally {
            log.info("Этот блок выполняется всегда");
        }

    }

    private static void usefulMethods (){
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            log.error("Caught Exception");
            log.error("getMessage():" + e.getMessage());
            log.error("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            log.error("toString():" + e);
            log.error("printStackTrace():");
            e.printStackTrace(System.out);
        }


    }

    // выброс существующего исключения
    private static void throwExeption() {
        int[] arr = {3};
        try {
            for (int i = 0; i < 2; i++) {
                if ((i < 0) || i >= arr.length) {
                    throw new ArrayIndexOutOfBoundsException("Не лезь за пределы массива ламер.");
                }
            }
        } catch (Exception e) {
            log.error("Перехыачено исключение ", e);
        }
    }

    // свое исключение
    private static void myExeption()  {
        try {
            throw new SimpleException("Простое но свое исключение");
        } catch (Exception e) {
            log.error("Перехыачено свое исключение ", e);
        }
    }

    // повторное исключение в catch
    private static void throwReExeption() {
        int[] arr = {3};

        try {
            int i = arr[5];
        } catch (Exception e) {
            log.error("Перехыачено первое исключение", e);
            throw e; // это же исключение выбрасывается повторно
//            throw new SimpleException("Повторное исключение при обработке первого");
        }
    }

    private static int test7() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e) {
            log.error("Перехыачено свое исключение ", e);
            return 10;
        } finally {
            log.info("Блок finally");
            return 100;
        }
    }
}
