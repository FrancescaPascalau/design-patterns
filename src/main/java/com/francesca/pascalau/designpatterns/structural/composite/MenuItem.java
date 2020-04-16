package com.francesca.pascalau.designpatterns.structural.composite;

public class MenuItem extends MenuComponent {

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
