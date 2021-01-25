
package com.madv.mylang.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApi1 {
    public static void main(String[] args) {
        createStreams();
        masterMetods();
    }

    public static void createStreams() {
        // создание списка из коллекции
        ArrayList<String> cities = new ArrayList();
        cities.addAll(Arrays.asList(new String[]{"Париж", "Лондон", "Мадрид"}));
        cities.stream() // получаем поток
                .filter(s -> s.length() == 6) // применяем фильтрацию по длине строки
                .forEach(s -> System.out.println(s)); // выводим отфильтрованные строки на консоль
        // создание потока из массива
        Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
        citiesStream.forEach(s -> System.out.println(s)); // выводим все элементы массива

        IntStream intStream = Arrays.stream(new int[]{1, 2, 4, 5, 7});
        intStream.forEach(i -> System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{100, 250, 400, 5843787, 237});
        longStream.forEach(l -> System.out.println(l));

        DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(d -> System.out.println(d));

//        И еще один способ создания потока представляет статический метод of(T..values) класса Stream:
        citiesStream = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(s -> System.out.println(s));

        intStream = IntStream.of(1, 2, 4, 5, 7);
        intStream.forEach(i -> System.out.println(i));

        longStream = LongStream.of(100, 250, 400, 5843787, 237);
        longStream.forEach(l -> System.out.println(l));

        doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d -> System.out.println(d));
    }

    public static void masterMetods() {
//         Метод forEach
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStream.forEach(s -> System.out.println(s));
//        Метод filter
        citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.filter(s->s.length()==6).forEach(s->System.out.println(s));
        // Отображение. Метод map
        IntStream intStream = IntStream.of(1, 2, 4, 5, 7);
        intStream.map(i -> i+5).forEach(i -> System.out.println(i));
        citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.map(p -> "столица "+p).forEach(System.out::println);
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

    }

}
