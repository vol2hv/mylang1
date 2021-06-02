package com.madv.mylang;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Место для изучения языка Java");
        HashSet<Integer> set = new HashSet<Integer>();
//        HashSet<String > set1 = new HashSet<String >();

        for (int i = 0; i < 5 ; i++) set.add(i);

        // через итераторы совсем в ручную
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        set.forEach(x -> System.out.println(x));
        System.out.println("-------------------------------");
        set.forEach(x -> {if (x %2 ==0){
            System.out.println(x);
        }});
        System.out.println("-------------------------------");
        set.forEach(System.out::println);


        // в ручную на половину
        // при удаление элементов из коллекции нельзя примерять цикл foreach
        for (Iterator<Integer> i = set.iterator(); i.hasNext();) {
            Integer element = i.next();
            if (element % 2 == 0) {
                i.remove();
            }
        }
        // полностью автоматически цикл foreach
        for (Integer i: set ) System.out.println(i);
        Set<Integer> integerSet = new HashSet<Integer>(){};
    }
}

