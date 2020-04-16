package com.francesca.pascalau.designpatterns.creational.factory;

public abstract class Website {

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
