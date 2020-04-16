package com.francesca.pascalau.designpatterns.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String shape) {
        if (shape != null) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }
}
