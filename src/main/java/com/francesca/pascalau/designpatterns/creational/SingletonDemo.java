package com.francesca.pascalau.designpatterns.creational;

public class SingletonDemo {

    private static volatile SingletonDemo instante = null;

    private SingletonDemo() {
        if (instante != null) {
            throw new RuntimeException("Use getInstance() to create.");
        }
    }

    public static SingletonDemo getInstance() {
        if (instante == null) {
            synchronized (SingletonDemo.class) {
                instante = new SingletonDemo();
            }
        }
        return instante;
    }
}
