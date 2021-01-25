package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.banking;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Developer;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectManger;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectTeamFactory;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
