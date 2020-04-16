package com.francesca.pascalau.designpatterns.behavioral.memento;

//originator
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento save() {
        return new Memento(name);
    }

    public void revert(Memento employeeMemento) {
        this.name = employeeMemento.getName();
    }

    @Override
    public String toString() {
        return "Employee name = " + name;
    }
}
