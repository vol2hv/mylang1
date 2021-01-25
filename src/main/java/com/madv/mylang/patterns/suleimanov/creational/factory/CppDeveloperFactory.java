package com.madv.mylang.patterns.suleimanov.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
