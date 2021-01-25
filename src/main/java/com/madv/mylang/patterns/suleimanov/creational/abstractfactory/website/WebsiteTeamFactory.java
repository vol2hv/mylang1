package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.website;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Developer;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectManger;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectTeamFactory;
import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
