package com.madv.mylang.patterns.suleimanov.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        new CppDeveloper().writeCode();
        new PhpDeveloper().writeCode();
    }

}
