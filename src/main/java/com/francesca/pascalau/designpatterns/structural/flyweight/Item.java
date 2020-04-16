package com.francesca.pascalau.designpatterns.structural.flyweight;

public class Item {

    private final String name;

    Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
