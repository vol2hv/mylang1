package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.website;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Tester;

public class ManualTester implements Tester{
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
