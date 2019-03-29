package com.madv.mylang.innerclass;

import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class JobWithList {


    public static void main(String[] args) {
//       Не рекомендуется
        List<Integer> integerList = new ArrayList<Integer>() {
            // anonymous constructor()
            {
                add(5);
                add(7);
                add(11);
            }
        };
        Map<Integer, String> intToString = new HashMap<Integer, String>(){{
            put(1, "one");
            put(2, "two");
            put(3, "three");
        }};
        System.out.println(integerList);
        System.out.println(intToString);

        //        Рекомендуется
        List<Integer> list = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(2, 3, 5)));
        List<Integer> list1 = Arrays.asList(2, 3, 5);
        List<String> list2 = Collections.unmodifiableList(Stream.of("abc", "bcd", "cde").collect(toList()));
        Set<String> set = Collections.unmodifiableSet(Stream.of("abc", "bcd", "cde").collect(toSet()));
    }
}
