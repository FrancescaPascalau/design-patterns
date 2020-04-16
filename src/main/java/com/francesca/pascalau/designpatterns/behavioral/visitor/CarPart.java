package com.francesca.pascalau.designpatterns.behavioral.visitor;

public interface CarPart {

    void acceptPart(CarPartVisitor visitor);
}
