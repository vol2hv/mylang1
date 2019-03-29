package com.madv.mylang;

import java.math.BigDecimal;

/**
 * Created by madv on 26.12.2016.
 */
public class BigDecimalSample {
    public static void main(String[] args) {
        double num = 234.33469;
        BigDecimal bd = BigDecimal.valueOf(num).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bd);

        num = 234.33569;
        bd = BigDecimal.valueOf(num).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bd);
        bd = new BigDecimal("123.549").setScale(2, BigDecimal.ROUND_UP);
        System.out.println(bd);
        bd = new BigDecimal(Double.toString(777.777)).setScale(2, BigDecimal.ROUND_UP);
        System.out.println(bd);

        System.out.println(new BigDecimal("2.222").add(new BigDecimal("3.333")).setScale(2, BigDecimal.ROUND_UP));
        System.out.println(new BigDecimal("2.222").subtract(new BigDecimal("3.333")).setScale(2, BigDecimal.ROUND_UP));
        System.out.println(new BigDecimal("2.222").multiply(new BigDecimal("3.333")).setScale(2, BigDecimal.ROUND_UP));
        System.out.println(new BigDecimal("2.222").divide (new BigDecimal("3.333"),2, BigDecimal.ROUND_UP));
        System.out.println(new BigDecimal("2.222").compareTo(new BigDecimal("3.333")));

    }
}

