package com.francesca.pascalau.designpatterns.creational.factory;

public class Blog extends Website {
    @Override
    protected void createWebsite() {
        System.out.println("Creating a blog");
    }
}