package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.banking;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
