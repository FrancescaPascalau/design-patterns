package com.francesca.pascalau.designpatterns.behavioral.memento;

//memento for employee class
public class Memento {

    private String name;

    public Memento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee name ='" + name;
    }
}
