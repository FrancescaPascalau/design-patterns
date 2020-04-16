package com.francesca.pascalau.designpatterns.behavioral.visitor;

public class Wheel implements CarPart {

    @Override
    public void acceptPart(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
