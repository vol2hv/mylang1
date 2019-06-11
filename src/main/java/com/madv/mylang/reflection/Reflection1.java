package com.madv.mylang.reflection;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

class FloatList extends ArrayList<Float>{}

@Log4j2
public class Reflection1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //        Класс String
        String str ="Просто строка";
        Class<?> strClass=str.getClass();
        String name= strClass.getName();
        log.info(name);

        //      Класс Object
        Object object = new Object();
        Class<?> objClass= object.getClass();
        log.info(objClass.getName());

        // Параметризированный класс да с наследованием
        ArrayList<Float> listOfNumbers = new FloatList();
        Class actualClass = listOfNumbers.getClass();
        ParameterizedType type = (ParameterizedType)actualClass.getGenericSuperclass();
        log.info(type);
//        System.out.println(type); // java.util.ArrayList<java.lang.Float>
//        Class parameter = (Class)type.getActualTypeArguments()[0];
        log.info(type.getActualTypeArguments()[0].getTypeName());
//        System.out.println(parameter); // class java.lang.Float
    }
}
