package com.francesca.pascalau.designpatterns.creational.factory;

import com.francesca.pascalau.designpatterns.creational.factory.Website;

public class Site extends Website {
    @Override
    protected void createWebsite() {
        System.out.println("Creating a site");
    }
}