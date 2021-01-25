package com.madv.mylang.patterns.suleimanov.creational.abstractfactory.website;

import com.madv.mylang.patterns.suleimanov.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
