package com.francesca.pascalau.designpatterns.structural.adapter;

public class RegularEmployee implements Employee {

    public String name;

    public RegularEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee Name: '" + name + '\'';
    }
}
