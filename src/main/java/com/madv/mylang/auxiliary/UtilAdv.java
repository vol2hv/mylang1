package com.madv.mylang.auxiliary;

import lombok.NonNull;

import java.util.Date;
/**
 * вывод строки на stdout
 * перед строкой выводится время и имя потока
 * номерация полей в формате должна начинаться с трех
 */

public class UtilAdv {
    public static void printfPlus(@NonNull String format, Object ... args){
        System.out.printf("Поток %2$s %1$tH:%1$tM:%1$tS.%1$tL ",
                new Date(),Thread.currentThread().getName());
        System.out.printf(format, args);
    }
}
