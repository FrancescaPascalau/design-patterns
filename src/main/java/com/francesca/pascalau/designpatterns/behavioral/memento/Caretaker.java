package com.francesca.pascalau.designpatterns.behavioral.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
