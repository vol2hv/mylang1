package com.madv.mylang.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// определяем функциональный интерфейс
interface PredicateMy<T> {
    boolean test(T t);
}

public class FirstSample {
    // фильтровать список испульзуя интерфейс import java.util.function.Predicate
    public static void filterListPredicate(List<Integer> list, Predicate<Integer> predicate){
        for (Integer i:list) {
            if (predicate.test(i)){
                System.out.print(i.toString()+" ");
            }
        }
        System.out.println();

        System.out.println("А теперь одним оператором");
        list.forEach(System.out::println);
    }

    // фильтровать список испульзуя свой интерфейс PredicateMy<T>
    public static void filterList(List<Integer> list, PredicateMy<Integer> predicate){
        for (Integer i:list) {
            if (predicate.test(i)){
                System.out.print(i.toString()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-5,-3,-2,-1,0,2,4,6);

        filterList(list, (n) -> n %2 == 0);
        filterListPredicate(list,n -> n < 0);
        Predicate<Integer> predicate = n -> n % 2 != 0;
        filterListPredicate(list,predicate);
    }

}
