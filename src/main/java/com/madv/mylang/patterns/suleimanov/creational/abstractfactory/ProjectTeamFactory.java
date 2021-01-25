package com.madv.mylang.patterns.suleimanov.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getFirstDeveloper();

    Developer getSecondDeveloper();

    Tester getTester();

    ProjectManger getProjectManager();
}
