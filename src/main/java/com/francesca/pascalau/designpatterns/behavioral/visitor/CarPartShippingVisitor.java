package com.francesca.pascalau.designpatterns.behavioral.visitor;

import java.util.List;

public class CarPartShippingVisitor implements CarPartVisitor {

    private double shippingCost = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingCost += 25.5;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        List<CarPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingCost -= 1;
        }
        System.out.println("Shipping total = " + shippingCost);
    }
}
