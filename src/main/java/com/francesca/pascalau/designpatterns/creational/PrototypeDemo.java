package com.francesca.pascalau.designpatterns.creational;

public class PrototypeDemo implements Cloneable {

    private final String id;

    public PrototypeDemo(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
