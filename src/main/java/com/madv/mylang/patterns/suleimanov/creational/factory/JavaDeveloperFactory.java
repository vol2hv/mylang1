package com.madv.mylang.patterns.suleimanov.creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
