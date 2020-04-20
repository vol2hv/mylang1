package com.madv.mylang.lambda;
/*
* передача лямбда выражения  в метод как параметра
* */

import java.util.Arrays;
import java.util.Collections;

// функциональный интерфейс
interface Expression{
    boolean isEqual(int n);
}
// класс, в котором определены методы
class ExpressionHelper{

    static boolean isEven(int n){

        return n%2 == 0;
    }

    static boolean isPositive(int n){

        return n > 0;
    }
}

public class TransferToMetod {

    public static void main(String[] args) {

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(ExpressionHelper::isEven, nums));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(expr, nums));
    }

    private static int sum(Expression func, int[] numbers)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
 }
