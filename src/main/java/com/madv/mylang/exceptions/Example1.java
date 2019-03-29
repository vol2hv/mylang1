package com.madv.mylang.exceptions;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

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
//@Slf4j
@Log4j2
public class Example1 {
//    static final Logger rootLogger = LogManager.getRootLogger();
//    static final Logger userLogger = LogManager.getLogger(Example1.class);
//    private  Logger logger = LogManager.getLogger(Example1.class);
    public static void main(String[] args) throws IOException, SimpleException {
//        test1();      // исключение передается для обработки вверх
//        test2();      // обработка исключения /
//        test3();    // выброс существующего исключения
//        test4();    // свое исключение
//        test5();    // повторное исключение в catch
//        test6();   // try-with-resources и catch обрабатывающий несколько исключений
        System.err.println(test7());
    }

    private static int test7() {
        try {
            System.err.println("Блок Try");
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            System.err.println("Блок Catch");
            return 10;
        } finally {
            System.err.println("Блок finally");
            return 100;
        }
    }

    // исключение передается для обработки вверх
    private static void test1() throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите делитель: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.printf("25/x= %d", 25 / x);
    }

    // обработка исключения
    private static void test2() {
        int[] arr = {3};
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println(arr[i]);
                System.err.println("Блок Try");
            } catch (Exception e) {
                System.err.println("Блок Catch");
                e.printStackTrace();
            } finally {
                System.err.println("Блок finally");
            }
        }
    }

    // выброс существующего исключения
    private static void test3() {
        int[] arr = {3};
        for (int i = 0; i < 2; i++) {
            if ((i < 0) || i >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Не лезь за пределы массива ламер.");
            }
            System.out.println(arr[i]);
        }

    }
    private static void test4() throws SimpleException {
        throw new SimpleException("Простое но свое исключение");
    }

    // повторное исключение в catch
    private static void test5() throws SimpleException, FileNotFoundException {
        int[] arr = {3};

        try {
            System.out.println(arr[5]);
            System.err.println("Блок Try");
        } catch (Exception e) {
            System.err.println("Блок Catch");
            e.printStackTrace();
           throw new ArrayIndexOutOfBoundsException();
//            throw new SimpleException("Повторное исключение при обработке первого");
        } finally {
            System.err.println("Блок finally");
        }

    }

    private static void test6() {
        try (BufferedReader in = new BufferedReader(new FileReader("d:\\_Java\\ProjectIJ\\SeaFight\\ship1.txt"));) {
            test4();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | SimpleException ex) { // два исключения сразу
            ex.printStackTrace();
        }
    }
}
