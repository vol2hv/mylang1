package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.banking;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
