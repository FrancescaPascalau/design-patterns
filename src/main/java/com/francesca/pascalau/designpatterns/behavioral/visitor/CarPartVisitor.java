package com.francesca.pascalau.designpatterns.behavioral.visitor;

public interface CarPartVisitor {

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
