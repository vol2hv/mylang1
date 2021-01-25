package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.website;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
