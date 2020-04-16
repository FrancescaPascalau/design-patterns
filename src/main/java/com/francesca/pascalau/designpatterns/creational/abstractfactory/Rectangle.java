package com.francesca.pascalau.designpatterns.creational.abstractfactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }
}
